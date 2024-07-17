package com.enes.jobapplication.controller;

import com.enes.jobapplication.handler.ResponseHandler;
import com.enes.jobapplication.model.User;
import com.enes.jobapplication.service.MyUserDetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserRestController {

    @Autowired
    private MyUserDetailsServices userDetailsService;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody User user) {
        try {
            return ResponseHandler.generateResponse(HttpStatus.OK, "User Registered", userDetailsService.saveUser(user));
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.NOT_FOUND, e.getMessage(), null);
        }
    }

}
