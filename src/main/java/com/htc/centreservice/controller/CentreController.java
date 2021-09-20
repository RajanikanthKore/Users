package com.htc.centreservice.controller;

import java.util.List;

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
	private Centre icentre;
	
	@GetMapping("/centre/{centre_id}")
	public Centre getCentrebyId(@PathVariable Long centre_id) {
		return icentre.findById(centre_id).get();
	}
	
	@PostMapping("/create/centre")
	public Centre createCentre(@RequestBody Centre centre) {
		return icentre.save(centre);
	}
	
	@GetMapping("/centre/{pincode}")
	public List<Centre> getCentrebypinCode(@PathVariable Long pincode) {
		return icentre.findByPin_code(pincode);
	}
}
