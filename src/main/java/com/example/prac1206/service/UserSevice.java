package com.example.prac1206.service;

import com.example.prac1206.dto.UserRequest;
import org.springframework.stereotype.Service;

@Service
public class UserSevice {
    public String login(UserRequest userRequest){
        return "token";
    }

}
