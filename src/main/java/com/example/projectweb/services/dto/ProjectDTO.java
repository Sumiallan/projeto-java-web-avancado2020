package com.example.projectweb.services.dto;

import java.util.HashSet;
import java.util.Set;

import com.example.projectweb.domain.Person;
import com.example.projectweb.domain.Project;
import com.example.projectweb.domain.Task;

public class ProjectDTO {

	private Long id;
	private String projectTitle;

	private Person manager;
	private int minSalary;
	private int maxSalary;


	private Set<Task> task = new HashSet<>();


	public ProjectDTO() {
		
	}
	
	public ProjectDTO(Project project) {
		
		this.id = project.getId();
		this.projectTitle = project.getProjectTitle();
		this.manager = project.getManager();
		this.minSalary = project.getMinSalary();
		this.maxSalary = project.getMaxSalary();
		this.task = project.getTask();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public Person getManager() {
		return manager;
	}

	public void setManager(Person manager) {
		this.manager = manager;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public Set<Task> getTask() {
		return task;
	}

	public void setTask(Set<Task> task) {
		this.task = task;
	}
	
}
