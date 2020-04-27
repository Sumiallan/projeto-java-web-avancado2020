package com.example.projectweb.services.dto;

import java.util.Date;

import com.example.projectweb.domain.Department;
import com.example.projectweb.domain.Person;
import com.example.projectweb.domain.Project;
import com.example.projectweb.domain.ProjectHistory;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ProjectHistoryDTO {
	
	

	private Long id;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date startDate;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date endDate;
	

	private Person manager;
	private Department department;
	
	private Project project;
	
	
	
	public ProjectHistoryDTO() {

	}

	public ProjectHistoryDTO(ProjectHistory projectHistory) {
		
		id = projectHistory.getId();
		startDate = projectHistory.getStartDate();
		endDate = projectHistory.getEndInstant();
		manager = projectHistory.getManager();
		department = projectHistory.getDepartment();
		project = projectHistory.getProject();
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

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
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
