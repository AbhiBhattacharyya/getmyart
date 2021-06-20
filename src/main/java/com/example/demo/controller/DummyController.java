package com.example.demo.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class DummyController {
	
	@RequestMapping("/hello")
	String sayHello() {
		return "Hello";
	}
}
