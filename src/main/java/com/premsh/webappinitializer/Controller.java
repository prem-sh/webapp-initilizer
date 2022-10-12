package com.premsh.webappinitializer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
	public Controller() {
		System.out.println("Bean Created");
	}
	@GetMapping("/")
	public ResponseEntity<String> index(){
		System.out.println("I am triggered");
		return ResponseEntity.ok("Helow hii !!");
	}
}

