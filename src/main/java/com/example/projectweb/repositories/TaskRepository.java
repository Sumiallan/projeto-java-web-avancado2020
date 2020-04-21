package com.example.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectweb.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
	

}
