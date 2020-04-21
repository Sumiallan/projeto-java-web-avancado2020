package com.example.projectweb.services.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.projectweb.domain.Department;
import com.example.projectweb.domain.Person;

public class DepartmentDTO {
	
	private Long id;
	private String departmentName;
	private List<Person> persons = new ArrayList<>(); 
	
	public DepartmentDTO(Department department) {
		
		id = department.getId();
		departmentName = department.getDepartmentName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Person> getPersons() {
		return persons;
	}
	
}
