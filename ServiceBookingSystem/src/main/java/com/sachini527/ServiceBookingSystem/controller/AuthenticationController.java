package com.sachini527.ServiceBookingSystem.controller;

import com.sachini527.ServiceBookingSystem.services.authentication.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AuthenticationController {

    @Autowired
    private AuthService authService;
}
