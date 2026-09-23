package com.sagar.app.configuration.service.impl;

import com.sagar.app.configuration.dto.MobileDto;
import com.sagar.app.configuration.service.MobileService;
import org.springframework.stereotype.Component;

@Component
public class MobileServiceImpl implements MobileService {
    @Override
    public void validateAndSave(MobileDto mobileDto) {
        System.out.println("validating mobile data " + mobileDto);
    }
}
