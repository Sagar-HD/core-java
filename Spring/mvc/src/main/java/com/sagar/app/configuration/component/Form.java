package com.sagar.app.configuration.component;

import com.sagar.app.configuration.dto.FormDto;
import com.sagar.app.configuration.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Form {

    @Autowired
    private FormService formService;

    @RequestMapping("/form")
    public String form(FormDto formDto, Model model) {
        System.out.println(formDto);
        model.addAttribute("message", "success");
        formService.validateAndSave(formDto);
        return "Form.jsp";
    }
}
