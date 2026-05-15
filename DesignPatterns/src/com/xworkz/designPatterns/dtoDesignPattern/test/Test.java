package com.xworkz.designPatterns.dtoDesignPattern.test;

import com.xworkz.designPatterns.dtoDesignPattern.dto.PassportDto;

public class Test {

    public static void main(String[] args) {
        PassportDto passportDto=new PassportDto();
        passportDto.setId(2);
        System.out.println(passportDto.getId());

    }
}
