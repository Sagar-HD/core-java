package com.sagar.app.configuration.service;

import com.sagar.app.configuration.dto.ProductDto;

public interface ProductService {
    void validateAndSave(ProductDto productDto);
}
