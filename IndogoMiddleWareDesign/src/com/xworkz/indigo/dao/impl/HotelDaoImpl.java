package com.xworkz.indigo.dao.impl;


import com.xworkz.indigo.dao.HotelDao;
import com.xworkz.indigo.dto.HotelSearchDto;
import com.xworkz.indigo.dto.HotelSearchPnrDto;

import java.util.Objects;

public class HotelDaoImpl implements HotelDao {
    @Override
    public boolean searchHotel(HotelSearchDto hotelSearchDto) {
        System.out.println("searching hotel..");
       if(Objects.nonNull(hotelSearchDto)){
           return true;
       }
       else{
           System.out.println("hotel search dto is null");
           return false;
       }
    }

    @Override
    public boolean searchHotelByPnr(HotelSearchPnrDto hotelSearchPnrDto) {
        System.out.println("searching hotel by pnr..");
        if(Objects.nonNull(hotelSearchPnrDto)){
            return true;
        }
        else{
            System.out.println("hotel search pnr dto is null");
            return false;
        }
    }
}
