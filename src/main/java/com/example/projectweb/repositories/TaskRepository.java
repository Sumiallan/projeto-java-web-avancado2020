package com.example.projectweb.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectweb.domain.Task;
import com.example.projectweb.services.dto.TaskDTO;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
	 List<TaskDTO> findByStartDateBetween(Date anoInicial, Date anoFinal);
	 List<TaskDTO> findTaskByStatus(int status);
	 List<TaskDTO> findTaskByStatusAndStartDateBetween(int status,Date anoInicial, Date anoFinal);
	 List<TaskDTO> findByTaskPointsBetween(int taskPoints, int taskPoints2);
	 
}
