package com.sagar.app.configuration.service;

import com.sagar.app.configuration.dto.TelephoneOperatorDto;

public interface TelephoneOperatorService {
    void validateAndSave(TelephoneOperatorDto telephoneOperatorDto);
}
