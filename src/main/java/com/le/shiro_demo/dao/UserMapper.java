package com.le.shiro_demo.dao;

import com.le.shiro_demo.model.User;

import java.util.List;

public interface UserMapper {
    List<User> getAll();

    User getUserByName(String principal);
}
