package com.sagar.components;

import com.sagar.dto.FormData;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormComponent {

    @RequestMapping("/saveForm")
    public String saveForm(@Valid FormData formData, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            System.out.println("Validation errors:");
            bindingResult.getFieldErrors().forEach(error ->
                    System.out.println(error.getField() + ": " + error.getDefaultMessage())
            );
            return "Form.jsp";
        } else {
            System.out.println("Validated and saving: " + formData);
            return "Form.jsp";
        }
    }
}
