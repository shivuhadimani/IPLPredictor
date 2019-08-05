package com.unisys.iplpredictor.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.unisys.iplpredictor.daoimpl.IplTeams;
import com.unisys.iplpredictor.pojo.team;

import java.util.List;

@Component
public class iplTeamServices {
	
	@Autowired
	IplTeams iplTeams;
	
	public List<team> IplTeams(){
		return iplTeams.iplTeams();
	}

}
