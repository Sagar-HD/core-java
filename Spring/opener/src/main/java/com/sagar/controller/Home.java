package com.sagar.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Home {
    @GetMapping
    public String home() {
        return "Index.jsp";
    }
}
