package com.sagar.app.configuration.service;

import com.sagar.app.configuration.dto.TempleDto;

public interface TempleService {
    void validateAndSave(TempleDto templeDto);
}
