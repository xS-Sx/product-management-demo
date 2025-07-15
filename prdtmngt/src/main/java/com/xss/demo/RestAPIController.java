package com.xss.demo;

// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

	// private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public String greeting(
			@RequestParam(value = "name", defaultValue = "World") String name) {
		return name;
	}
}