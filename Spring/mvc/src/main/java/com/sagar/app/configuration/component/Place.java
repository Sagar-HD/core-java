package com.sagar.app.configuration.component;

import com.sagar.app.configuration.dto.PlaceDto;
import com.sagar.app.configuration.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Place {

    @Autowired
    private PlaceService placeService;

    @RequestMapping("/place")
    public String place(PlaceDto placeDto, Model model) {
        System.out.println(placeDto);
        model.addAttribute("message", "success");
        placeService.validateAndSave(placeDto);
        return "Place.jsp";
    }
}
