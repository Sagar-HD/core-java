package com.xworkz.indigo.dao;

import com.xworkz.indigo.dto.FlightSearchDto;
import com.xworkz.indigo.dto.FlightStatusRequestDto;

public interface FlightDao {

    boolean searchFlight(FlightSearchDto flightSearchDTO);
    boolean checkFlightStatus(FlightStatusRequestDto flightStatusRequestDto);


}
