package com.sagar.app.configuration.component;

import com.sagar.app.configuration.dto.TempleDto;
import com.sagar.app.configuration.service.TempleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Temple {

    @Autowired
    private TempleService templeService;

    @RequestMapping("/temple")
    public String temple(TempleDto templeDto, Model model) {
        System.out.println(templeDto);
        model.addAttribute("message", "success");
        templeService.validateAndSave(templeDto);
        return "Temple.jsp";
    }
}
