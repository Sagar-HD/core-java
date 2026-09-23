package com.sagar.app.configuration.service.impl;

import com.sagar.app.configuration.dto.TelephoneOperatorDto;
import com.sagar.app.configuration.service.TelephoneOperatorService;
import org.springframework.stereotype.Component;

@Component
public class TelephoneOperatorServiceImpl implements TelephoneOperatorService {
    @Override
    public void validateAndSave(TelephoneOperatorDto telephoneOperatorDto) {
        System.out.println("validating telephone operator data " + telephoneOperatorDto);
    }
}
