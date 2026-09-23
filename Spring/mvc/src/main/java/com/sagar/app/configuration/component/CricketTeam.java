package com.sagar.app.configuration.component;

import com.sagar.app.configuration.dto.CricketTeamDto;
import com.sagar.app.configuration.service.CricketTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CricketTeam {

    @Autowired
    private CricketTeamService cricketTeamService;

    @RequestMapping("/cricketTeam")
    public String cricketTeam(CricketTeamDto cricketTeamDto, Model model) {
        System.out.println(cricketTeamDto);
        model.addAttribute("message", "success");
        cricketTeamService.validateAndSave(cricketTeamDto);
        return "CricketTeam.jsp";
    }
}
