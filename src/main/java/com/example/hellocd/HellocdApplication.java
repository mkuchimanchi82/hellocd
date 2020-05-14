package com.example.hellocd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellocdApplication {

	@RequestMapping("/hellocd")
	String home() {
		return "Hello CD ! Wohhooooo ";
	}

	public static void main(String[] args) {
		SpringApplication.run(HellocdApplication.class, args);
	}
}
