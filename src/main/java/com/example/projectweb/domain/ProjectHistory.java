package com.example.projectweb.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ProjectHistory {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date startDate;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date endDate;
	
	@OneToOne
	private Person manager;
	
	@OneToOne
	private Department department;
	
	@OneToOne
	private Project project;

	@OneToOne
	private Task task;
	
	public ProjectHistory() {
		
	}
	

	public ProjectHistory(Long id, Date startDate, Date endDate, Person manager, Department department,
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartInstant(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndInstant() {
		return endDate;
	}

	public void setEndInstant(Date endDate) {
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
