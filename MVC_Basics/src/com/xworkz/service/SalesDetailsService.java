package com.xworkz.service;

import com.xworkz.dto.SalesDetailsDTO;

public interface SalesDetailsService {
    boolean validateAndSave(SalesDetailsDTO data);
    SalesDetailsDTO[] getAllSalesDetails();
}
