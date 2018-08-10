package com.wis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wis.dao.TicketingDao;
import com.wis.dto.MovieDto;

public class TicketingService {
	 
	TicketingDao ticketingDao;
	
	
	public TicketingDao getTicketingDao() {
		return ticketingDao;
	}


	public void setTicketingDao(TicketingDao ticketingDao) {
		this.ticketingDao = ticketingDao;
	}


	public List<MovieDto> addMovie(String movieName){
	
	return	ticketingDao.addMovie(movieName);
	}

}
