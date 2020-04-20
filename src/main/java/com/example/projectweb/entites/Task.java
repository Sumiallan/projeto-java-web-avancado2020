package com.example.projectweb.entites;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.projectweb.entites.enums.Status;
@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private String taskPoints;
	private Integer Status;
	private Instant startDate;
	private Instant endDate;
	
	public Task() {
		
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

	public String getTaskPoints() {
		return taskPoints;
	}

	public void setTaskPoints(String taskPoints) {
		this.taskPoints = taskPoints;
	}

	public Integer getStatus() {
		return Status.valueOf(Status) ;
	}

	public void setStatus(Status status) {
		if (status != null) {
		this.Status = status.getCode();
		}
	}

	public Instant getStartDate() {
		return startDate;
	}

	public void setStartDate(Instant startDate) {
		this.startDate = startDate;
	}

	public Instant getEndDate() {
		return endDate;
	}

	public void setEndDate(Instant endDate) {
		this.endDate = endDate;
	}
	

}
