package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserControllers {
	@GetMapping
	public String getUsers() {
		return "http get request was sent";
	}
	@PostMapping
	public String createUser() {
		return "http post request was sent";
	}
	@PutMapping
	public String updateUsers() {
		return "http put request was sent";
	}
	@DeleteMapping
	public String deleteUsers() {
		return "http delete request was sent";
	}
	
	
}
