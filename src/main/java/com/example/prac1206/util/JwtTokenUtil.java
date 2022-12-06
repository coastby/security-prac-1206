package com.example.prac1206.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtTokenUtil {
    //token 생성하는 함수
    public static String generateToken(String userId, String key, long expiredTimeMs){
        Claims claims = Jwts.claims();
        claims.put("userId", userId);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expiredTimeMs))
                .signWith(SignatureAlgorithm.HS256, key)
                .compact();
    }
    //claims을 추출하는 메서드
    public static Claims extractClaims(String token, String key){
        return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
    }

    //token이 유효한지 체크하는 메서드
    public static boolean isExpired(String token, String secretKey) {
        Date expitedDate = extractClaims(token, secretKey).getExpiration();
        return expitedDate.before(new Date());
    }
    //token에서 userId 가져오는 메서드
    public static String getUserId(String token, String secretKey){
        return extractClaims(token, secretKey).get("userId").toString();
    }
}
