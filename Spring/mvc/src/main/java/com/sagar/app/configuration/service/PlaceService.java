package com.sagar.app.configuration.service;

import com.sagar.app.configuration.dto.PlaceDto;

public interface PlaceService {
    void validateAndSave(PlaceDto placeDto);
}
