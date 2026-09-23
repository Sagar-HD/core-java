package com.sagar.app.configuration.service;

import com.sagar.app.configuration.dto.CricketTeamDto;

public interface CricketTeamService {
    void validateAndSave(CricketTeamDto cricketTeamDto);
}
