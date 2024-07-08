package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
public class User {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="department_id", nullable = false)
	private Department department;
}
