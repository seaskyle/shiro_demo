package com.le.shiro_demo.controller;

import com.le.shiro_demo.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @PostMapping("/doLogin")
    public ModelAndView doLogin(User tokenUser) {
        Subject subject = SecurityUtils.getSubject();
        ModelAndView mv = new ModelAndView();
        try {
            subject.login(new UsernamePasswordToken(tokenUser.getUserName(), tokenUser.getPassword()));
        } catch (AuthenticationException e) {
            mv.setViewName("/html/login");
            mv.addObject("message", "认证失败");
            return mv;
        }
        mv.setViewName("redirect:/html/index");
        return mv;
    }
}
