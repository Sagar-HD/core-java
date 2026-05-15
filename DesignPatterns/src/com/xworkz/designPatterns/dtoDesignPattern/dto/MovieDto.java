package com.xworkz.designPatterns.dtoDesignPattern.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private String name;
    private String[] Cast;
    private String[] streamingLanguages;
    private String gener;
    private double durationInHrs;

}
