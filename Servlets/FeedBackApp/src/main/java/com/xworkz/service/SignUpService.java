package com.xworkz.service;

import com.xworkz.dao.UserDao;
import com.xworkz.dto.UserDto;

public interface SignUpService {


    boolean validateAndSave(UserDto userDto);
}
