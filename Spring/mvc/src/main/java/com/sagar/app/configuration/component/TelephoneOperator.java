package com.sagar.app.configuration.component;

import com.sagar.app.configuration.dto.TelephoneOperatorDto;
import com.sagar.app.configuration.service.TelephoneOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TelephoneOperator {

    @Autowired
    private TelephoneOperatorService telephoneOperatorService;

    @RequestMapping("/telephoneOperator")
    public String telephoneOperator(TelephoneOperatorDto telephoneOperatorDto, Model model) {
        System.out.println(telephoneOperatorDto);
        model.addAttribute("message", "success");
        telephoneOperatorService.validateAndSave(telephoneOperatorDto);
        return "TelephoneOperator.jsp";
    }
}
