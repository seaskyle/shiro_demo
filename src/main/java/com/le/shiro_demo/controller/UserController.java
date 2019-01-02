package com.le.shiro_demo.controller;

import com.le.shiro_demo.model.User;
import com.le.shiro_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @GetMapping()
    public List<User> getAll() {
        return userService.getAll();
    }
}
