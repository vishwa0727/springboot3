package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Project11Application {

	public static void main(String[] args) {
		SpringApplication.run(Project11Application.class, args);
	}
	
	@GetMapping("/home")
	public String home() {
		
		
		return "Home";
	}

}
