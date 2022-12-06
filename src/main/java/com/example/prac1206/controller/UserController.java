package com.example.prac1206.controller;

import com.example.prac1206.dto.UserRequest;
import com.example.prac1206.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userSevice) {
        this.userService = userSevice;
    }

    @PostMapping(value = "/login")
    public String login(@RequestBody UserRequest userRequest){
        String token = userService.login(userRequest);
        return token;
    }
}
