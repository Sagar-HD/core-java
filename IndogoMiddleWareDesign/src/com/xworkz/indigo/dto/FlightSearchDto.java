package com.xworkz.indigo.dto;

import com.xworkz.indigo.constants.TripType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightSearchDto {
private TripType tripType;
private String fromAddress;
private String toAddress;
private LocalDate departureDate;
private int noOfPassengers;
}
