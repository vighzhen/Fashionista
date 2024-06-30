package com.vighzhen.fashionista.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vighzhen.fashionista.models.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
