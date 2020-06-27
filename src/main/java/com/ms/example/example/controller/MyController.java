package com.ms.example.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/myapp")
public class MyController {

	@GetMapping("/ping")
	public String ping() {
		return "OK. I am running" ;
    }	
	
	
	@GetMapping(path= "/{name}", produces = "application/json")
	public String hello(@PathVariable("name")String name) {
		System.out.println("I am inside hello()");
		
	
		return "Hello! You have entered :  "+name;
		
	}

	
}
