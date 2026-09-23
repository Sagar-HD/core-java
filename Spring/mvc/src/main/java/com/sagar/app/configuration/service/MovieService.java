package com.sagar.app.configuration.service;

import com.sagar.app.configuration.dto.MovieDto;

public interface MovieService {
    void validateAndSave(MovieDto movieDto);
}
