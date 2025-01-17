package com.example.Uber.services;

import com.example.Uber.dto.DriverDto;
import com.example.Uber.dto.SignupDto;
import com.example.Uber.dto.UserDto;

public interface AuthService {

    String login(String email, String password);
    UserDto signUp(SignupDto signupDto);
    DriverDto onBoardNewDriver(Long userId);
}
