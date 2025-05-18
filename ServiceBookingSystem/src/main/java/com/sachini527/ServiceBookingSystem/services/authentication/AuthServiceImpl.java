package com.sachini527.ServiceBookingSystem.services.authentication;

import com.sachini527.ServiceBookingSystem.dto.SignupRequestDTO;
import com.sachini527.ServiceBookingSystem.dto.UserDto;
import com.sachini527.ServiceBookingSystem.entity.User;
import com.sachini527.ServiceBookingSystem.enums.UserRole;
import com.sachini527.ServiceBookingSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    public UserDto signupClient(SignupRequestDTO signupRequestDTO){
        User user = new User();

        user.setName(signupRequestDTO.getName());
        user.setLastName(signupRequestDTO.getLastName());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPhone(signupRequestDTO.getPhone());
        user.setPassword(signupRequestDTO.getPassword());

        user.setRole(UserRole.CLIENT);

        return userRepository.save(user).getDto();
    }
}
