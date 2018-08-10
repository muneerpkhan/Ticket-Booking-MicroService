package com.wis.dao;

 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.wis.dto.MovieDto;
import com.wis.rowmapper.MovieRowMapper;


public class TicketingDao {
	
	JdbcTemplate jdbcTemplate;
	 
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


public List<MovieDto> addMovie(String movieName){
	
	String flag ="failed";
	//List<MovieDto> dto = new ArrayList<MovieDto>();
	  
	String sql = "insert into movies(movie_name)values(?)";
	int i = jdbcTemplate.update(sql, new Object[]{movieName});
	 List<MovieDto> list=null;
	 if(i == 1){
		 
		String sql1 = "SELECT movie_name FROM movies";
		 
	    list = jdbcTemplate.query(sql1, new MovieRowMapper());
		 for(MovieDto dto :list){
			 System.out.println(dto.getName());
		 }
		 return list;
	 }
	return list;	 
	}
	
	
	 
}



