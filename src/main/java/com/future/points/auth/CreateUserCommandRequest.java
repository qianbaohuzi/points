package com.future.points.auth;

import lombok.Data;

@Data
public class CreateUserCommandRequest {

    private String phone;

    private String username;

    private String password;
}