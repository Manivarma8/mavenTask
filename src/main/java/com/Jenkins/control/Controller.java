package com.Jenkins.control;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping(value = "/get/{name}")
	public String getLast(@PathVariable String name) {
		return "The last letter of the name is " + name.charAt(name.length()-1);
	}
}
