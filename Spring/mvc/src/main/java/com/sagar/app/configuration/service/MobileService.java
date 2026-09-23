package com.sagar.app.configuration.service;

import com.sagar.app.configuration.dto.MobileDto;

public interface MobileService {
    void validateAndSave(MobileDto mobileDto);
}
