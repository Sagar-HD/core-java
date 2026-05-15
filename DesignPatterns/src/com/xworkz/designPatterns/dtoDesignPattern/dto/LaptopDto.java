package com.xworkz.designPatterns.dtoDesignPattern.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LaptopDto {
    private int id;
    private int serialNo;
    private String modelName;
    private String brand;
}
