package com.sagar.app.configuration.service.impl;

import com.sagar.app.configuration.dto.ProductDto;
import com.sagar.app.configuration.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Override
    public void validateAndSave(ProductDto productDto) {
        System.out.println("validating product data " + productDto);
    }
}
