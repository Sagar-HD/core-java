package com.xworkz.indigo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelSearchDto {
    private String destinationName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Integer noOfPassengers;
}
