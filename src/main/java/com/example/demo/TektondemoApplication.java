package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TektondemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TektondemoApplication.class, args);
	}
	
	@RequestMapping("/tekton")
	public String hello()
	{
		return "Welcome to Tekton";
	}

}
