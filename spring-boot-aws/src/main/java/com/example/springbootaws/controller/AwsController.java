package com.example.springbootaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to AWS Deployment";
	}

}
