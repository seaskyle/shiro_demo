package com.le.shiro_demo.controller;

import com.le.shiro_demo.model.ResponseJson;
import com.le.shiro_demo.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @PostMapping("/doLogin")
    @ResponseBody
    public ResponseJson doLogin(User tokenUser) {
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(tokenUser.getName(), tokenUser.getPassword()));
        } catch (AuthenticationException e) {
            return ResponseJson.error(401, "认证失败！");
        }
        return ResponseJson.ok("认证通过！");
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
