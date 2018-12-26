package com.le.shiro_demo.controller;

import com.le.shiro_demo.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @PostMapping("/login")
    public String doLogin(User tokenUser) {
        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken(tokenUser.getUserName(), tokenUser.getPassword()));
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
