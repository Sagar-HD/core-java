package com.xworkz.indigo.service;

import com.xworkz.indigo.dto.FlightSearchDto;
import com.xworkz.indigo.dto.FlightStatusRequestDto;

public interface FlightService {
    boolean validateAndSearch(FlightSearchDto flightSearchDto);
    boolean checkFlightStatus(FlightStatusRequestDto flightStatusRequestDto);
}
