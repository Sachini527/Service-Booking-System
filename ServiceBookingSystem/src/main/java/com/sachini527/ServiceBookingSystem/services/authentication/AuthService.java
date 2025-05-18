package com.sachini527.ServiceBookingSystem.services.authentication;

import com.sachini527.ServiceBookingSystem.dto.SignupRequestDTO;
import com.sachini527.ServiceBookingSystem.dto.UserDto;

public interface AuthService {

    UserDto signupClient(SignupRequestDTO signupRequestDTO);

    Boolean presentByEmail(String email);
}
