package com.example.prac1206.service;

import com.example.prac1206.dto.UserRequest;
import com.example.prac1206.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Value("${jwt.token.secret}")
    private String secretKey;
    private long expiredTimeMs = 1000 * 5 * 60; //5분으로 설정


    public String login(UserRequest userRequest){
        //아이디 비밀번호 확인없이 일단 토큰 발급
        String token = JwtTokenUtil.generateToken(userRequest.getUserId(), secretKey, expiredTimeMs);
        return token;
    }
}
