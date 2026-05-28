package com.xworkz.service;

import com.xworkz.dto.OrderDetailsDTO;

public interface OrderDetailsService {
    boolean validateAndSave(OrderDetailsDTO orderDetailsDTO);
    OrderDetailsDTO[] getAllOrderDetails();

}
