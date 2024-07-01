package com.vighzhen.fashionista.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vighzhen.fashionista.models.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
