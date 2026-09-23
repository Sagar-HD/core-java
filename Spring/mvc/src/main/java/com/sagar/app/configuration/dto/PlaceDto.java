package com.sagar.app.configuration.dto;

import lombok.Data;

@Data
public class PlaceDto {
    private String placeName;
    private String city;
    private String state;
    private String country;
    private String description;
    private String famousFor;

}
