package com.le.shiro_demo.service;

import com.le.shiro_demo.dao.UserMapper;
import com.le.shiro_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> getAll() {
        return userMapper.getAll();
    }

    public User getUserByName(String principal) {
        return userMapper.getUserByName(principal);
    }
}
