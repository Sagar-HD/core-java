package com.xworkz.service.implementations;

import com.xworkz.dto.SalesDetailsDTO;
import com.xworkz.service.SalesDetailsService;

public class SalesDetailsServiceImpl implements SalesDetailsService {
    @Override
    public boolean validateAndSave(SalesDetailsDTO data) {
//        private String productName;
//        private int noOfProductsSold;
//        private double costPerUnit;
//        private int totalAStock;
//        private int noOfExpiery;
        System.out.println("executing valid and save method in sales service impl..");
        if(data.getProductName()!=null && data.getNoOfProductsSold()>=0 && data.getCostPerUnit()>=0 && data.getTotalAStock()>=0 && data.getNoOfExpiery()>=0 ){
            System.out.println("valid data proceeding to save");
        }
        else{
            System.out.println("invalid data");
            return false;
        }
return true;
    }

    @Override
    public SalesDetailsDTO[] getAllSalesDetails() {
        return new SalesDetailsDTO[0];
    }
}
