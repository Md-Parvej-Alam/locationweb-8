package com.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.location.entity.Rocations;
import com.location.ropsitory.RocationRepository;



@Controller
public class RocationController {
	
	@Autowired
	private RocationRepository rocationRepo;
	
	
	@RequestMapping("/show")
	public String showLocationpage() {
		return "create_location";
		

}
	
	@RequestMapping("/saveLocation")
	public String  saveLocationData(Rocations rocation) {
		
		rocationRepo.save(rocation);
		 return "create_location";
		
	}
}
