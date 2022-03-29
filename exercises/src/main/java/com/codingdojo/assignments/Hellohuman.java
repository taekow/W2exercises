package com.codingdojo.exercises;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellohuman {

	@RequestMapping("/hello")
	public String helloHuman() {
		return "Hello human";
	}
	
	@RequestMapping("/{firstname}")
	public String firstName(@PathVariable String firstname) {
		return "Hello " + firstname;
	}
	
	@RequestMapping("/hello/{firstname}")
	public String firstAndLastName(
			@PathVariable String firstname,
			@RequestParam(value="lastname", required=false) String lastname) {
		return ("Hello " + firstname + " " + lastname);
	}
}
