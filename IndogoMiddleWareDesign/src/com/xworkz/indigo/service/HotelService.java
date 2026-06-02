package com.xworkz.indigo.service;

import com.xworkz.indigo.dto.HotelSearchDto;
import com.xworkz.indigo.dto.HotelSearchPnrDto;

public interface HotelService {
    boolean searchHotel(HotelSearchDto hotelSearchDto);
    boolean searchHotelByPnr(HotelSearchPnrDto hotelSearchPnrDto);
}
