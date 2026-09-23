package com.sagar.app.configuration.service.impl;

import com.sagar.app.configuration.dto.FormDto;
import com.sagar.app.configuration.service.FormService;
import org.springframework.stereotype.Component;

@Component
public class FormServiceImpl implements FormService {
    @Override
    public void validateAndSave(FormDto formDto) {
        System.out.println("validating form data "+ formDto);

    }
}
