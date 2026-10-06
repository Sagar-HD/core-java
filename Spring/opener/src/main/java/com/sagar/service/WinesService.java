package com.sagar.service;

import com.sagar.dto.Wine;
import org.springframework.stereotype.Component;


public interface WinesService {
    void validateAndSaveWine(Wine wine);
}
