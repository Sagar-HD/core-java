package com.xworkz.service;

import com.xworkz.dto.UserDto;

public class SignUpServiceImpl implements SignUpService{
    @Override
    public boolean validateAndSave(UserDto userDto) {
        System.out.println("running in service method");

        return true;
    }
}
