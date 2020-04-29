package com.lagou.mapper;

import com.lagou.pojo.Order;

import java.util.List;

public interface IUserMapper {
    List<Order> findOrderAndUser();
}
