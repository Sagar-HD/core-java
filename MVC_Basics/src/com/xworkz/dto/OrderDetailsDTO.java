package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
public class OrderDetailsDTO implements Serializable {
    private int orderNumber;
    private String[] items;
    private double totalCost;
}
