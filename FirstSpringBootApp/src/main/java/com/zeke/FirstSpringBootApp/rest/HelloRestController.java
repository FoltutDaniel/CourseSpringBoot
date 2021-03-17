package com.zeke.FirstSpringBootApp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/")
	public String show() {
		return "Hellow world! Time is " + LocalDateTime.now();
	}
}
