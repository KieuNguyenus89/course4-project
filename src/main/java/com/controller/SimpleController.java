package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@GetMapping(value="/")
	public String sayHello() {
		return "Welcome to Spring boot with rest api develop in EC2 using jenkin by Kieu";
	}

}
