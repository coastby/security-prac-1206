package com.example.prac1206.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @PostMapping
    public String write(String title, String userId, Authentication authentication){
        String tokenUserId = authentication.getPrincipal().toString();
        return tokenUserId + " SUCCESS";
    }
}
