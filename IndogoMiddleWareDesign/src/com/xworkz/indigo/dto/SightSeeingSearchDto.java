package com.xworkz.indigo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SightSeeingSearchDto {
    private String destination;
    private LocalDate tripDate;
}
