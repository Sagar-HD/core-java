package com.sagar.app.configuration.component;

import com.sagar.app.configuration.dto.MovieDto;
import com.sagar.app.configuration.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Movie {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/movie")
    public String movie(MovieDto movieDto, Model model) {
        System.out.println(movieDto);
        model.addAttribute("message", "success");
        movieService.validateAndSave(movieDto);
        return "Movie.jsp";
    }
}
