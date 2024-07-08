package com.example.demo.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.request.UserDto;
import com.example.demo.model.Department;
import com.example.demo.model.User;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	DepartmentRepository deparmentRepository;

	@Override
	@Transactional
	public User addUser(UserDto userDto) {
		Department department = deparmentRepository.findById(userDto.getDepartmentId()).get();
		User user = User.builder()
				.name(userDto.getName())
				.age(userDto.getAge())
				.department(department)
				.build();
		return userRepository.save(user);
	}

}
