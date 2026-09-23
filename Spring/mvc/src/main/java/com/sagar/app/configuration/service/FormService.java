package com.sagar.app.configuration.service;

import com.sagar.app.configuration.dto.FormDto;
import org.springframework.stereotype.Component;


public interface FormService {
    void validateAndSave(FormDto formDto);
}
