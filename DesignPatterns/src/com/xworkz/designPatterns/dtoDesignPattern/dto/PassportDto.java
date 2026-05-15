package com.xworkz.designPatterns.dtoDesignPattern.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PassportDto implements Serializable {

    private int id;
    private String name;
    private int age;
    @Getter(AccessLevel.NONE)
    private long phoneNumber;



}
