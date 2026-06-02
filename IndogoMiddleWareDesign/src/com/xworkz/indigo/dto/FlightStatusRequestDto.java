package com.xworkz.indigo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightStatusRequestDto {
    private String pnr;
    private LocalDate date;
}
