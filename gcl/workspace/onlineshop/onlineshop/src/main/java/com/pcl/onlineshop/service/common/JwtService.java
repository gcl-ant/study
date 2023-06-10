package com.pcl.onlineshop.service.common;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class JwtService {

    @Value("#{olShop.jwt.expired.time}")
    long EXPIRE_DATE;

    @Value("#{olShop.jwt.key}")
    String JWT_KEY;

    //SALT
    private static final String TOKEN = "";

    public String createToken(String userId) {
        //过期时间设置
        Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_DATE);

        JwtBuilder builder
                = Jwts.builder()
                .setId(userId)
                .setIssuedAt(expiresAt)
                .signWith(SignatureAlgorithm.HS256, JWT_KEY);

        return builder.compact();
    }

    public String parser(String token) {
        Claims claims
                = Jwts.parser().setSigningKey(JWT_KEY).parseClaimsJws(token).getBody();

        String userId = claims.getId();

        return userId;
    }
}
