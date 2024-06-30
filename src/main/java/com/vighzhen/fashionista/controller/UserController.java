package com.vighzhen.fashionista.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sun.net.httpserver.Authenticator;
import com.sun.net.httpserver.HttpsServer;
import com.vighzhen.fashionista.common.BaseResponse;
import com.vighzhen.fashionista.common.ErrorCode;
import com.vighzhen.fashionista.common.ResultUtils;
import com.vighzhen.fashionista.mapper.UserMapper;
import com.vighzhen.fashionista.models.User;
import com.vighzhen.fashionista.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.xml.transform.Result;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    /***
     * 登陆
     * @param username
     * @param password
     * @return BaseResponse<User>
     */
    @GetMapping("/login")
    public BaseResponse<User> login(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {

        if (username == null || password == null) {
            return ResultUtils.error(ErrorCode.PARAMS_ERROR, "用户或密码有误");
        }
        User userLogin = userService.login(username, password);
        if (userLogin == null) {
            return ResultUtils.error(ErrorCode.OPERATION_ERROR, "用户不存在");
        }
        request.getSession().setAttribute("user", userLogin);
        return ResultUtils.success(userLogin);
    }

    /***
     * 注册用户
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    public BaseResponse addUser(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        if (username == null || password == null) {
            return ResultUtils.error(ErrorCode.PARAMS_ERROR, "请求参数错误");
        }
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername, username);
        User is_user = this.userMapper.selectOne(queryWrapper);
        if (is_user != null) {
            return ResultUtils.error(ErrorCode.OPERATION_ERROR, "用户已存在");
        }
        boolean save = userService.save(user);
        return ResultUtils.success(save);
    }

    /***
     * 移除user
     * @param request
     */
    @GetMapping("/out")
    public void out(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
    }
}
