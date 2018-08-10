package com.wis.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wis.dto.MovieDto;

public class MovieRowMapper implements RowMapper<MovieDto>{
	
 
	@Override
	public MovieDto mapRow(ResultSet rs, int arg1) throws SQLException {

		MovieDto dto = new MovieDto();
		dto.setName(rs.getString("movie_name"));
		
		return dto;
	}

}
