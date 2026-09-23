package com.sagar.app.configuration.service.impl;

import com.sagar.app.configuration.dto.CameraDto;
import com.sagar.app.configuration.service.CameraService;
import org.springframework.stereotype.Component;

@Component
public class CameraServiceImpl implements CameraService {
    @Override
    public void validateAndSave(CameraDto cameraDto) {
        System.out.println("validating camera data " + cameraDto);
    }
}
