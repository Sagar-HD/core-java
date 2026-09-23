package com.sagar.app.configuration.service.impl;

import com.sagar.app.configuration.dto.CricketTeamDto;
import com.sagar.app.configuration.service.CricketTeamService;
import org.springframework.stereotype.Component;

@Component
public class CricketTeamServiceImpl implements CricketTeamService {
    @Override
    public void validateAndSave(CricketTeamDto cricketTeamDto) {
        System.out.println("validating cricket team data " + cricketTeamDto);
    }
}
