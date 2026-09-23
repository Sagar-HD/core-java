package com.sagar.app.configuration.service;

import com.sagar.app.configuration.dto.ContactDto;

public interface ContactService {
    void validateAndSave(ContactDto contactDto);
}
