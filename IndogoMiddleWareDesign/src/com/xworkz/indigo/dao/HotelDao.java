package com.xworkz.indigo.dao;

import com.xworkz.indigo.dto.HotelSearchDto;
import com.xworkz.indigo.dto.HotelSearchPnrDto;

public interface HotelDao {
    boolean searchHotel(HotelSearchDto hotelSearchDto);
    boolean searchHotelByPnr(HotelSearchPnrDto hotelSearchPnrDto);
}
