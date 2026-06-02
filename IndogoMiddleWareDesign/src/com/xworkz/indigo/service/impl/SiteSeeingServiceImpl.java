package com.xworkz.indigo.service.impl;

import com.xworkz.indigo.dao.SightSeeingDao;
import com.xworkz.indigo.dto.SightSeeingSearchDto;
import com.xworkz.indigo.service.SiteSeeingService;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class SiteSeeingServiceImpl implements SiteSeeingService {
    private SightSeeingDao sightSeeingDao;
    @Override
    public boolean searchSite(SightSeeingSearchDto sightSeeingSearchDto) {
        System.out.println("executing serach in site seeing service");
       if(Objects.nonNull(this.sightSeeingDao)){
           return sightSeeingDao.searchSite(sightSeeingSearchDto);
       }
       else{
           System.out.println("site seeing dao cannot be null ");
           return false;
       }
    }
}
