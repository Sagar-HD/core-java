package com.xworkz.indigo.dao.impl;

import com.xworkz.indigo.dao.SightSeeingDao;
import com.xworkz.indigo.dto.SightSeeingSearchDto;

import java.util.Objects;

public class SiteSeeingDaoImpl implements SightSeeingDao {
    @Override
    public boolean searchSite(SightSeeingSearchDto sightSeeingSearchDto) {
        System.out.println("searching site using dao");
      if(Objects.nonNull(sightSeeingSearchDto)){
          return  true;
      }
      else{
          System.out.println("site seeing dto is null");
          return false;
      }
    }
}
