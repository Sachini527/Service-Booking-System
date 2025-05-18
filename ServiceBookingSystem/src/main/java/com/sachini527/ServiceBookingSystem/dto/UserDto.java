package com.sachini527.ServiceBookingSystem.dto;

import com.sachini527.ServiceBookingSystem.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String email;

    private String password;

    private String name;

    private String lastName;

    private String phone;

    private UserRole role;
}
