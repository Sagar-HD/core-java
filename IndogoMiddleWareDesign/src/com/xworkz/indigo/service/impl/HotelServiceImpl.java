package com.xworkz.indigo.service.impl;

import com.xworkz.indigo.dao.HotelDao;
import com.xworkz.indigo.dto.HotelSearchDto;
import com.xworkz.indigo.dto.HotelSearchPnrDto;
import com.xworkz.indigo.service.HotelService;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class HotelServiceImpl implements HotelService {
    private HotelDao hotelDao;
    @Override
    public boolean searchHotel(HotelSearchDto hotelSearchDto) {
        if(Objects.nonNull(this.hotelDao)){
            return hotelDao.searchHotel(hotelSearchDto);
        }
        System.out.println("hotel dao is null cannot serach");
        return false;
    }

    @Override
    public boolean searchHotelByPnr(HotelSearchPnrDto hotelSearchPnrDto) {
        if(Objects.nonNull(this.hotelDao)){
            return hotelDao.searchHotelByPnr(hotelSearchPnrDto);
        }
        System.out.println("hotel dao is null cannot serach");
        return false;
    }
}
