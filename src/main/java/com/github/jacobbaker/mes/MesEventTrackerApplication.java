package com.github.jacobbaker.mes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event;
import com.github.jacobbaker.mes.domain.EventType;

@SpringBootApplication
@RestController
public class MesEventTrackerApplication {

	EventType event = EventType.RUN_START;

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello, World!";
	}

	@GetMapping("/AnotherForPractice")
	public String willHauser() {
		return "This is easy!";
	}

	@GetMapping("/event")
	public String getEvent() {
		return "Current event: " + event;
	}

	public static void main(String[] args) {
		SpringApplication.run(MesEventTrackerApplication.class, args);
	}

}
