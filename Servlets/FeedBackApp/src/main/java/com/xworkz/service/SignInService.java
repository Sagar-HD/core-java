package com.xworkz.service;

import com.xworkz.dao.UserDao;
import com.xworkz.dto.UserDto;
import com.xworkz.dto.UserLoginDto;

public class SignInService {
    private UserDao userDao;

    public SignInService(UserDao userDao){
        this.userDao=userDao;
    }

    public boolean verifyLogin(UserLoginDto userLoginDto){
        return userDao.validateLogin(userLoginDto);
    }
    public UserDto userByName(String username){
        return userDao.userByName(username);
    }
}
