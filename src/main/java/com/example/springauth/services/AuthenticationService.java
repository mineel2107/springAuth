package com.example.springauth.services;

import com.example.springauth.dto.JwtAuthenticationResponse;
import com.example.springauth.dto.RefreshTokenRequest;
import com.example.springauth.dto.SignInRequest;
import com.example.springauth.dto.SignUpRequest;
import com.example.springauth.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
