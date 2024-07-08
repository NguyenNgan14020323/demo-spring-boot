package com.example.demo.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
	@Length(max = 100, message = "Character length from 1 to 100")
	@NotNull(message = "Name is required")
	private String name;
	
	@Min(value = 1, message = "Min age is 1")
	@Max(value = 100, message = "Max age is 100")
	@NotNull(message = "Age is required")
	private Integer age;
	
	@Min(value = 1, message = "Min deparmentId is 1")
	@NotNull(message = "DepartmentId is required")
	private Integer departmentId;
}
