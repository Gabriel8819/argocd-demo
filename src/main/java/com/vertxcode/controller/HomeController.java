package com.vertxcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HomeController {

	@GetMapping("/home")
	public String getHome() {
		return "Hello world argo cd!!!!!!!! Test-3";
	}
	
}
	
	
	
