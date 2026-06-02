package com.xworkz.indigo.service.impl;

import com.xworkz.indigo.dao.FlightDao;
import com.xworkz.indigo.dto.FlightSearchDto;
import com.xworkz.indigo.dto.FlightStatusRequestDto;
import com.xworkz.indigo.service.FlightService;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class FlightServiceImpl implements FlightService {
    private FlightDao flightDao;

    @Override
    public boolean validateAndSearch(FlightSearchDto flightSearchDto) {
        if(flightDao!=null){
          return flightDao.searchFlight(flightSearchDto);
        }
        else{
            System.out.println("flight dao cannot be null");
            return false;
        }
    }

    @Override
    public boolean checkFlightStatus(FlightStatusRequestDto flightStatusRequestDto) {
        if(Objects.nonNull(this.flightDao)){
            return flightDao.checkFlightStatus(flightStatusRequestDto);
        }
        System.out.println("flight dao cannot be null");
        return false;
    }
}
