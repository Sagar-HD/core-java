package com.xworkz.designPatterns.dtoDesignPattern.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HotelDto {
    private String name;
    private boolean onlineBookingAvailability;
    private String[] menu;
}
