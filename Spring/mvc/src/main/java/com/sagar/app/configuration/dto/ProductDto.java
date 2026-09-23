package com.sagar.app.configuration.dto;

import lombok.Data;

@Data
public class ProductDto {
    private String productName;
    private String category;
    private String price;
    private String description;
    private String manufacturer;
    private String stock;

}
