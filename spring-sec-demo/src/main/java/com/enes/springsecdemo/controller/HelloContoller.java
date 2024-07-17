package com.enes.springsecdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "<div style='text-align:center; margin-top: 100px;'><h1>Hello, " + request.getSession().getId() + "</h1></div>";
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request) {
        return "<div style='text-align:center; margin-top: 100px;'><h1>About, " + request.getSession().getId() + "</h1></div>";
    }
}
