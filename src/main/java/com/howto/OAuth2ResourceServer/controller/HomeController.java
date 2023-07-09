package com.howto.OAuth2ResourceServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/") 
	public String home() {
		return "안녕";
	}
	
	@GetMapping("/secured") 
	public String secured() {
		return "안녕, 보호됨!";
	}
}
