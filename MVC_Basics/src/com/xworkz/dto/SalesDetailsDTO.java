package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SalesDetailsDTO implements Serializable {
    private String productName;
    private int noOfProductsSold;
    private double costPerUnit;
    private int totalAStock;
    private int noOfExpiery;

}
