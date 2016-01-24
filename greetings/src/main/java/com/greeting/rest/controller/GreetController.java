package com.greeting.rest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greeting.rest.model.Birthday;
import com.greeting.rest.service.AgecalcService;

@RestController
public class GreetController {
	@Autowired
	private AgecalcService agecalcService;
	
	private static final String greeting ="Hello %s, welcome to my webservice";

	@RequestMapping(value="/greeting",method=RequestMethod.GET,produces="text/html")
	public String greet(@RequestParam(value="name", defaultValue="Kalyani") String name){
	
		return String.format(greeting, name);
	
}
	@RequestMapping(value="/ageCal/{dob}", method=RequestMethod.GET,produces="application/json")
	public Birthday age(@PathVariable String dob){
		return agecalcService.calculateAge(dob); 
	}
	
}
