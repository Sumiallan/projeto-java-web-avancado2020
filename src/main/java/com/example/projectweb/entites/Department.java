package com.example.projectweb.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id; 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String departmentName;
	
	public Department() {
	
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
	
	
	
}
