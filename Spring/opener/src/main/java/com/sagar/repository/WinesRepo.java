package com.sagar.repository;

import com.sagar.dto.Wine;
import org.springframework.stereotype.Component;

@Component
public class WinesRepo {
    public void save(Wine wine) {
        System.out.println("saving wine..."+wine);
    }
}
