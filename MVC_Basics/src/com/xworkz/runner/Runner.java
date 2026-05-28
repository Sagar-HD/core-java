package com.xworkz.runner;

import com.xworkz.dto.OrderDetailsDTO;
import com.xworkz.dto.SalesDetailsDTO;
import com.xworkz.service.OrderDetailsService;
import com.xworkz.service.SalesDetailsService;
import com.xworkz.service.implementations.OrderDetailsServiceImpl;
import com.xworkz.service.implementations.SalesDetailsServiceImpl;

public class Runner {
    public static void main(String[] args) {
        SalesDetailsDTO salesDetailsDTO=new SalesDetailsDTO(null,10,500,200,0);
        SalesDetailsService salesDetailsService=new SalesDetailsServiceImpl();

        salesDetailsService.validateAndSave(salesDetailsDTO);
        //
        String[] items={"dosa","pizza","coffee"};
        OrderDetailsDTO orderDetailsDTO=new OrderDetailsDTO(1,items,450);
        OrderDetailsService orderDetailsService=new OrderDetailsServiceImpl();
        
        orderDetailsService.validateAndSave(orderDetailsDTO);
        //
        orderDetailsDTO.setTotalCost(-100);

        orderDetailsService.validateAndSave(orderDetailsDTO);
    }
}
