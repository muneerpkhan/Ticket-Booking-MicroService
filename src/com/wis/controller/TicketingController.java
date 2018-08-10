package com.wis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wis.dto.MovieDto;
import com.wis.service.TicketingService;

@Controller
public class TicketingController {
	
 
	TicketingService ticketingService;
	
	
	public TicketingService getTicketingService() {
		return ticketingService;
	}

	public void setTicketingService(TicketingService ticketingService) {
		this.ticketingService = ticketingService;
	}

	@RequestMapping("/welcome")
	public ModelAndView method2() {

		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("msg", "secondcontroller");
		return modelAndView;
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView andView = new ModelAndView("index");
		return andView;
	}
	 
	/*@RequestMapping(value="index",method = RequestMethod.GET)
	@ResponseBody
	public String method3(){
		
		if(userInputmine.equalsIgnoreCase("Mutton")){
			return "Available";
		}else if (userInputmine.equalsIgnoreCase("Chicken")) {
			return "Available";
		}else if (userInputmine.equalsIgnoreCase("Barbeque")) {
			return "Available";
		} else
			return "Not Available";
		 
		 
	}*/
	
	@RequestMapping("/Movies")
	public ModelAndView Movies() {
		ModelAndView andView = new ModelAndView("Movies");
		return andView;
	}
	 
	@RequestMapping(value ="AddingMovies" , params = {"addMovie"})
	public ModelAndView addMovie(@RequestParam("name") String movieName, ModelMap modelMap, HttpServletRequest request) {
		
		modelMap.addAttribute("moviename", movieName);
		ModelAndView andView = new ModelAndView("Movies");
		List<MovieDto> movies = ticketingService.addMovie(movieName);
		request.setAttribute("moviesList", movies);
		return andView;
	}
		 
		 
		/*ModelAndView andView = new ModelAndView("Movies");
		return andView;*/
	}
	 


