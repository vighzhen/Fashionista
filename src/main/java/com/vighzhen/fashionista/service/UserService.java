package com.vighzhen.fashionista.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vighzhen.fashionista.models.User;
import org.springframework.stereotype.Service;


public interface UserService extends IService<User> {

    public User login(String username, String password);
}
