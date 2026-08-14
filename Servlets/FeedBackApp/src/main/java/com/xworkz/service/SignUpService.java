package com.xworkz.service;

import com.xworkz.dto.UserDto;

public interface SignUpService {
    boolean validateAndSave(UserDto userDto);
}
