package com.sagar.service;

import com.sagar.dto.Wine;
import com.sagar.repository.WinesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WineServiceImpl implements WinesService{

    @Autowired
    private WinesRepo winesRepo;


    @Override
    public void validateAndSaveWine(Wine wine) {
        System.out.println("validating wine...");
        winesRepo.save(wine);
    }
}
