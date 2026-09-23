package com.sagar.app.configuration.dto;

import lombok.Data;

@Data
public class MovieDto {
    private String movieName;
    private String director;
    private String releaseYear;
    private String genre;
    private String language;
    private String rating;

}
