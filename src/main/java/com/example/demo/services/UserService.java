package com.example.demo.services;

import com.example.demo.dto.request.UserDto;
import com.example.demo.model.User;

public interface UserService {
	User addUser(UserDto userDto);
}
