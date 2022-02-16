package com.spring.SpringArtifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class SpringArtifactApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringArtifactApplication.class, args);
	}

	@GetMapping
	public String saluditos() {
		return "Holi :) A Pablo se le ha roto el servidor, haciéndolo inmortal";
	}
}
