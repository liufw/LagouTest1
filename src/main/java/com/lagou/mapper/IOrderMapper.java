package com.lagou.mapper;

import com.lagou.pojo.User;

import java.util.List;

public interface IOrderMapper {
     List<User> findUserAndOrder();
}
