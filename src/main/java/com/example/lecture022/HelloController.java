package com.example.lecture022;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping
	public ResponseEntity<String> helloWorld(){
		return ResponseEntity.ok("Hello World!");
	}
	@GetMapping
	public String foo() {
		return "foo";
	}
	@GetMapping
	public String bar() {
		return "bar";
	}

}
