package com.example.Uber.services.impl;

import com.example.Uber.dto.DriverDto;
import com.example.Uber.dto.SignupDto;
import com.example.Uber.dto.UserDto;
import com.example.Uber.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServideImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signUp(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
