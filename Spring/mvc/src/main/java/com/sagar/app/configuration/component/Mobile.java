package com.sagar.app.configuration.component;

import com.sagar.app.configuration.dto.MobileDto;
import com.sagar.app.configuration.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Mobile {

    @Autowired
    private MobileService mobileService;

    @RequestMapping("/mobile")
    public String mobile(MobileDto mobileDto, Model model) {
        System.out.println(mobileDto);
        model.addAttribute("message", "success");
        mobileService.validateAndSave(mobileDto);
        return "Mobile.jsp";
    }
}
