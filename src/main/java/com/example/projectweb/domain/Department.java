package com.example.projectweb.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String departmentName;
	
	@OneToMany
	private List<Person> persons = new ArrayList<>(); 
	
	public Department() {
		
	}
	
	
	public Department(Long id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Department(String departmentName) {
		this.departmentName = departmentName;
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
