package com.course.practicaljava.rest.controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcom to Spring Boot..it's going to be GREAT";
	}

	@GetMapping("/time")
	public String time() {
		return LocalTime.now().toString();
	}
}
