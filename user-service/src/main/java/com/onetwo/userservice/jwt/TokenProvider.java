package com.onetwo.userservice.jwt;

import org.springframework.security.core.Authentication;

public interface TokenProvider {

    String createAccessToken(Authentication authentication);

    String createRefreshToken(Authentication authentication);

    Authentication getAuthentication(String token);

    boolean validateToken(String token);
}
