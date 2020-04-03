package com.course.practicaljava.rest.controller;

import java.time.LocalTime;

import org.apache.tomcat.util.buf.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestController {

	private Logger log = LoggerFactory.getLogger(DefaultRestController.class);

	@GetMapping("/welcome")
	public String welcome() {

		String[] strArray = { "Hello", "This is ", "Spring Boot ", "REST API" };
		log.info(StringUtils.join(strArray));

		return "Welcom to Spring Boot..it's going to be GREAT";
	}

	@GetMapping("/time")
	public String time() {
		return LocalTime.now().toString();
	}
}
