package com.xworkz.indigo.dao.impl;

import com.xworkz.indigo.dao.FlightDao;
import com.xworkz.indigo.dto.FlightSearchDto;
import com.xworkz.indigo.dto.FlightStatusRequestDto;

import java.util.Objects;

public class FlightDaoImpl implements FlightDao {

    @Override
    public boolean searchFlight(FlightSearchDto flightSearchDTO) {
        System.out.println("searching flight ..");
        if(flightSearchDTO!=null){
            System.out.println("data saved ..");
            return true;
        }
        return false;
    }

    @Override
    public boolean checkFlightStatus(FlightStatusRequestDto flightStatusRequestDto) {
        System.out.println("executing flight status check in dao");
        if(Objects.nonNull(flightStatusRequestDto)){
            return true;
        }
        else{
            System.out.println("flight status request cannot be null");
            return false;
        }
    }
}
