package com.example.projectweb.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String projectTitle;
	
	@OneToOne
	private Person manager;
	private int minSalary;
	private int maxSalary;

	@ManyToMany
	private Set<Task> task = new HashSet<>();

	public Project() {
	}

	public Project(Long id, String projectTitle, Person manager, int minSalary, int maxSalary) {
		super();
		this.id = id;
		this.projectTitle = projectTitle;
		this.manager = manager;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
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

}
