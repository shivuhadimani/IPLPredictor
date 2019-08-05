package com.unisys.iplpredictor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.unisys.iplpredictor.pojo.team;
import com.unisys.iplpredictor.servicesimpl.iplTeamServices;

@RestController
public class teamsController {

	@Autowired
	iplTeamServices teamService;
	
	@ResponseBody
	@RequestMapping(value="/getTeams",produces="application/json")
	public List<team> teamNames(){
		return teamService.IplTeams();
	}
}
