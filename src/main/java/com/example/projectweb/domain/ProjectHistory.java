package com.example.projectweb.domain;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProjectHistory {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private Instant startDate;
	private Instant endDate;
	
	@OneToOne
	private Person manager;
	
	@OneToOne
	private Department department;
	
	@OneToOne
	private Project project;
	
	public ProjectHistory() {
		
	}
	

	public ProjectHistory(Long id, Instant startDate, Instant endDate, Person manager, Department department,
			Project project) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.manager = manager;
		this.department = department;
		this.project = project;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getStartDate() {
		return startDate;
	}

	public void setStartInstant(Instant startDate) {
		this.startDate = startDate;
	}

	public Instant getEndInstant() {
		return endDate;
	}

	public void setEndInstant(Instant endDate) {
		this.endDate = endDate;
	}

	public Person getManager() {
		return manager;
	}

	public void setManager(Person manager) {
		this.manager = manager;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
	
}
