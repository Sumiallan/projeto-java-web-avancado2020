package com.example.projectweb.services.dto;

import java.util.Date;

import com.example.projectweb.domain.Task;
import com.fasterxml.jackson.annotation.JsonFormat;

public class TaskDTO {
	

	private Long id;
	private String title;
	private String description;
	private int taskPoints;
	private int status;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date startDate;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date endDate;
	
	
	public TaskDTO() {
		
	}
	
	public TaskDTO(Task task) {
		
		this.id = task.getId();
		this.title = task.getTitle();
		this.description = task.getDescription();
		this.taskPoints = task.getTaskPoints();
		this.status = task.getStatus();
		this.startDate = task.getStartDate();
		this.endDate = task.getEndDate();
		
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTaskPoints() {
		return taskPoints;
	}

	public void setTaskPoints(int taskPoints) {
		this.taskPoints = taskPoints;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
	

}
