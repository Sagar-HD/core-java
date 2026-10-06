package com.sagar.controller;

import com.sagar.dto.Wine;
import com.sagar.service.WinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/wines")
public class WinesController {

    @Autowired
    private WinesService winesService;

    @PostMapping
    public String addWine(@Valid Wine wine, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "WinesForm.jsp";
        }
        winesService.validateAndSaveWine(wine);
        model.addAttribute("message", "data saved successfully");
        return "WinesForm.jsp";
    }
}
