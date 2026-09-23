package com.sagar.app.configuration.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class Home {
    @GetMapping("/")
    public String home() {
        return "Index.jsp";
    }
}
