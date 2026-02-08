package com.github.jacobbaker.mes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MesEventTrackerApplication {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello, World!";
	}

	@GetMapping("/AnotherForPractice")
	public String willHauser() {
		return "This is easy!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MesEventTrackerApplication.class, args);
	}

}
