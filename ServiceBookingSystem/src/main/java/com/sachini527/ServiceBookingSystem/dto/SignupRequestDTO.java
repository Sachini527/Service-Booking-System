package com.sachini527.ServiceBookingSystem.dto;

import lombok.Data;

@Data

public class SignupRequestDTO {
    private Long id;

    private String email;

    private String password;

    private String name;

    private String lastName;

    private String phone;

}
