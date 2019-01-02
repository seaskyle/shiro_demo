package com.le.shiro_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommController {
    @GetMapping("/html/{path}")
    public String commForward(String path) {
        return path;
    }
}
