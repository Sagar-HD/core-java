package com.xworkz.indigo.Runner;

import com.xworkz.indigo.dao.FlightDao;
import com.xworkz.indigo.dao.HotelDao;
import com.xworkz.indigo.dao.SightSeeingDao;
import com.xworkz.indigo.dao.impl.FlightDaoImpl;
import com.xworkz.indigo.dao.impl.HotelDaoImpl;
import com.xworkz.indigo.dao.impl.SiteSeeingDaoImpl;
import com.xworkz.indigo.dto.*;
import com.xworkz.indigo.service.FlightService;
import com.xworkz.indigo.service.HotelService;
import com.xworkz.indigo.service.SiteSeeingService;
import com.xworkz.indigo.service.impl.FlightServiceImpl;
import com.xworkz.indigo.service.impl.HotelServiceImpl;
import com.xworkz.indigo.service.impl.SiteSeeingServiceImpl;

public class Main {
    public static void main(String[] args) {
        //Flight search testing ..
        FlightDao flightDao=new FlightDaoImpl();
        FlightService flightService=new FlightServiceImpl(flightDao);
        FlightSearchDto flightSearchDto=new FlightSearchDto();
        boolean saved=flightService.validateAndSearch(flightSearchDto);
        System.out.println("saved :"+saved);
         saved=flightService.validateAndSearch(null);
        System.out.println("saved :"+saved);

        //Hotel Search Testinh
        HotelSearchDto hotelSearchDto=new HotelSearchDto();
        HotelSearchPnrDto hotelSearchPnrDto=new HotelSearchPnrDto();
        HotelDao hotelDao=new HotelDaoImpl();
        HotelService hotelService=new HotelServiceImpl(hotelDao);
        boolean hotel1=hotelService.searchHotel(hotelSearchDto);
        boolean hotel2=hotelService.searchHotelByPnr(hotelSearchPnrDto);
        System.out.println("hotel 1 search :"+hotel1);
        System.out.println("hotel 2 search :"+hotel2);

        // Sight Search Testing
        SightSeeingSearchDto sightSeeingSearchDto=new SightSeeingSearchDto();
        SightSeeingDao sightSeeingDao=new SiteSeeingDaoImpl();
        SiteSeeingService siteSeeingService=new SiteSeeingServiceImpl(sightSeeingDao);
       boolean site= sightSeeingDao.searchSite(sightSeeingSearchDto);
        System.out.println("site search :"+site);
       // Flight status Testing
        FlightStatusRequestDto flightStatusRequestDto=new FlightStatusRequestDto();
       boolean status= flightDao.checkFlightStatus(flightStatusRequestDto);
        System.out.println("flight status :"+status);
        status=flightDao.checkFlightStatus(null);
        System.out.println("flight status :"+status);
    }
}
