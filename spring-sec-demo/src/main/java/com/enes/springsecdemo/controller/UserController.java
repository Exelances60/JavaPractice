package com.enes.springsecdemo.controller;

import com.enes.springsecdemo.dao.UserRepository;
import com.enes.springsecdemo.model.User;
import com.enes.springsecdemo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return  userServices.saveUser(user);
    }
}
