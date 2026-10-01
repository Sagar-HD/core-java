package com.sagar.components;

import com.sagar.dto.FormData;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormComponent {

    @PostMapping
    public String saveForm(@Valid FormData formData, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getFieldErrors());
            model.addAttribute("formData", formData);
            return "Form.jsp";
        } else {
            System.out.println("Validated and saving: " + formData);
            return "Form.jsp";
        }
    }

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("formData", new FormData());
        return "Form.jsp";
    }
}
