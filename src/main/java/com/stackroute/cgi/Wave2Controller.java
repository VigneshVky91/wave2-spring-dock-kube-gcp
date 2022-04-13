package com.stackroute.cgi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wave2Controller {
	@GetMapping("/msg")
	public String getMessage() {
		return "Hello from IBM Wave 2 Batch";
	}

}
