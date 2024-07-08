package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.UserDto;
import com.example.demo.model.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping(path = "/users", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User addUser(@Valid @RequestBody UserDto userDto) {
		return userService.addUser(userDto);
	}

	@GetMapping("/users")
	public String hello() {
		return "hello";
	}
}
