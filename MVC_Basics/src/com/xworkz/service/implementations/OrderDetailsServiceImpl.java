package com.xworkz.service.implementations;

import com.xworkz.dto.OrderDetailsDTO;
import com.xworkz.service.OrderDetailsService;

public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Override
    public boolean validateAndSave(OrderDetailsDTO orderDetailsDTO) {
        System.out.println("Executing validateAndsave in orderDetailsService impl");
        if(orderDetailsDTO.getItems()!=null && orderDetailsDTO.getTotalCost()>=0){
            System.out.println(" valid data proceeding to save");
        }
        else{
            System.out.println("invalid data");
        }
        return true;
    }

    @Override
    public OrderDetailsDTO[] getAllOrderDetails() {
        return new OrderDetailsDTO[0];
    }
}
