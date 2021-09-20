package com.htc.centreservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.centreservice.persistance.ICentre;
import com.htc.centreservices.entity.Centre;

@RestController
@RequestMapping("/api")
public class CentreController {
	
	@Autowired
	private ICentre repo;

	@GetMapping("/centres/{centreId}")
	Centre getPatient(@PathVariable Long centreId)
	{
		Centre cen=repo.getById(centreId).get();
		return cen;
		
	}



	@PostMapping("/centres")
	Centre createPatient(@RequestBody Centre cen)
	{
		return cen;
}
	}
