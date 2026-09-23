package com.sagar.app.configuration.component;

import com.sagar.app.configuration.dto.CameraDto;
import com.sagar.app.configuration.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Camera {

    @Autowired
    private CameraService cameraService;

    @RequestMapping("/camera")
    public String camera(CameraDto cameraDto, Model model) {
        System.out.println(cameraDto);
        model.addAttribute("message", "success");
        cameraService.validateAndSave(cameraDto);
        return "Camera.jsp";
    }
}
