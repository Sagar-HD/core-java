package com.sagar.app.configuration.service.impl;

import com.sagar.app.configuration.dto.TempleDto;
import com.sagar.app.configuration.service.TempleService;
import org.springframework.stereotype.Component;

@Component
public class TempleServiceImpl implements TempleService {
    @Override
    public void validateAndSave(TempleDto templeDto) {
        System.out.println("validating temple data " + templeDto);
    }
}
