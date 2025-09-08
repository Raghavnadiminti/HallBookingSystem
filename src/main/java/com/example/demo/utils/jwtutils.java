package com.example.demo.utils;


import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;


import java.security.Key;
import java.util.Date;

public class jwtutils {
    private static final String SECRET = "1234";
    private static final long EXPIRATION = 5000 * 60 * 60;
    private final Key key = Keys.hmacShaKeyFor(SECRET.getBytes());

    public String generateToken(String str,String role){
        return Jwts.builder().setSubject(str).claim("role", role).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
    public String getDetails(String token){
        return Jwts.parserBuilder().setSigningKey(key).build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean validate(String token){
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parse(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }


}
