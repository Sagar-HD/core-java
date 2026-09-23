package com.sagar.app.configuration.component;

import com.sagar.app.configuration.dto.ContactDto;
import com.sagar.app.configuration.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Contact {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/contact")
    public String contact(ContactDto contactDto, Model model) {
        System.out.println(contactDto);
        model.addAttribute("message", "success");
        contactService.validateAndSave(contactDto);
        return "Contact.jsp";
    }
}
