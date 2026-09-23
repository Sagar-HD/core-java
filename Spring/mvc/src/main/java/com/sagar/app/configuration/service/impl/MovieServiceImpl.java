package com.sagar.app.configuration.service.impl;

import com.sagar.app.configuration.dto.MovieDto;
import com.sagar.app.configuration.service.MovieService;
import org.springframework.stereotype.Component;

@Component
public class MovieServiceImpl implements MovieService {
    @Override
    public void validateAndSave(MovieDto movieDto) {
        System.out.println("validating movie data " + movieDto);
    }
}
