package com.unisys.iplpredictor.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.unisys.iplpredictor.pojo.team;
import com.unisys.iplpredictor.queries.*;

@Repository
public class IplTeams {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<team> iplTeams(){
		return jdbcTemplate.query(iplDataQueries.GET_ALL_TEAM_NAMES,  (rs,i)->{
			return new team(rs.getString(1));
		});
	}

}
