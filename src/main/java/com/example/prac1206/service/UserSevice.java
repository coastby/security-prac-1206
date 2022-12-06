package com.example.prac1206.service;

import com.example.prac1206.dto.UserRequest;
import com.example.prac1206.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserSevice {
    private final UserRepository userRepository;

    public UserSevice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String login(UserRequest userRequest){
        String token = userRepository.findByUserId(userRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("찾는 아이디가 없습니다.")).getPassword();
        return token;
    }

}
