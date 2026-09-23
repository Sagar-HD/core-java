package com.sagar.app.configuration.dto;

import lombok.Data;

@Data
public class ContactDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String message;

}
