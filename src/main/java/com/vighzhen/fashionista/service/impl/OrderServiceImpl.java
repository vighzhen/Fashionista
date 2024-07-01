package com.vighzhen.fashionista.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vighzhen.fashionista.mapper.OrderMapper;
import com.vighzhen.fashionista.models.Order;
import com.vighzhen.fashionista.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
}
