package com.demo.demo;

import java.nio.file.Files;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
public class DemoApplication {
	
	@GetMapping("/home")
    public String redirectToHome() {
		return "redirect:/index.html";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
