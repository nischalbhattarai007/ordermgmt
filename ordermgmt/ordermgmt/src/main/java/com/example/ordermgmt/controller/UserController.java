package com.example.ordermgmt.controller;

import com.example.ordermgmt.model.User;
import com.example.ordermgmt.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserRepository userRepository;
    public UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @PostMapping
    public User createUser(@RequestBody User u){
        return userRepository.save(u);
    }
}
