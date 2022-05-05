package com.location.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.location.entity.Rocations;
import com.location.ropsitory.RocationRepository;


public class RocationServiceImpl implements RocationService {
	
	
	@Autowired
	private RocationRepository rocationRepo;
     
	@Override
	public void saveRocation(Rocations rocation) {
		rocationRepo.save(rocation);

	}

}
