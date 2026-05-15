package com.xworkz.designPatterns.dtoDesignPattern.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDto {
    private  String name;
    private String[] skills;
    private int yearsOfExperience;
    private String[] softSkills;
    private String[] achievements;

}
