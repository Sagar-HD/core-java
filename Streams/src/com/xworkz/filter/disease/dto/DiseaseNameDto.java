package com.xworkz.filter.disease.dto;

public class DiseaseNameDto {
    String name;

    public DiseaseNameDto(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DiseaseNameDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
