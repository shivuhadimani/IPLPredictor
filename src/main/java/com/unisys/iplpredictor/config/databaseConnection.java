package com.unisys.iplpredictor.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@ComponentScan("com.unisys.iplpredictor")
@Configuration
public class databaseConnection {

	private final String url = "jdbc:postgresql://localhost/iplteam";
	
	@Bean
    public DataSource dataSource() {
  	  DriverManagerDataSource dataSource = new DriverManagerDataSource();
  	  dataSource.setDriverClassName("org.postgresql.Driver");
  	  dataSource.setUrl(url);
  	  dataSource.setUsername("postgres");
  	  dataSource.setPassword("");
  	  return dataSource;
	}
    
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

}
