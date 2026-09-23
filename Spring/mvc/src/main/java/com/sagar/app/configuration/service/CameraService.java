package com.sagar.app.configuration.service;

import com.sagar.app.configuration.dto.CameraDto;

public interface CameraService {
    void validateAndSave(CameraDto cameraDto);
}
