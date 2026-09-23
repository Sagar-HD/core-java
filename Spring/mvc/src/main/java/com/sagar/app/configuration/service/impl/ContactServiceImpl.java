package com.sagar.app.configuration.service.impl;

import com.sagar.app.configuration.dto.ContactDto;
import com.sagar.app.configuration.service.ContactService;
import org.springframework.stereotype.Component;

@Component
public class ContactServiceImpl implements ContactService {
    @Override
    public void validateAndSave(ContactDto contactDto) {
        System.out.println("validating contact data " + contactDto);
    }
}
