package com.xworkz.designPatterns.dtoDesignPattern.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArtistDto {
    private  String name;
    private String type;
    private String[] artCollections;

}
