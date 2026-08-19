package com.xworkz.service;

import com.xworkz.dao.UserDao;
import com.xworkz.dto.UserDto;

public class SignUpServiceImpl implements SignUpService{
    private UserDao userDao;

    public SignUpServiceImpl(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public boolean validateAndSave(UserDto userDto) {
        System.out.println("running in service method");
        userDao.save(userDto);
        return true;
    }
}
