package com.sagar.app.configuration.service.impl;

import com.sagar.app.configuration.dto.PlaceDto;
import com.sagar.app.configuration.service.PlaceService;
import org.springframework.stereotype.Component;

@Component
public class PlaceServiceImpl implements PlaceService {
    @Override
    public void validateAndSave(PlaceDto placeDto) {
        System.out.println("validating place data " + placeDto);
    }
}
