package com.example.projectweb.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.projectweb.domain.Task;
import com.example.projectweb.repositories.TaskRepository;
import com.example.projectweb.services.dto.TaskDTO;
import com.example.projectweb.services.exceptions.ResourceNotFoundException;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repository;
	
	public List<Task> findAll(){
		return repository.findAll();
		
	}
	public Task findById(Long id) {
		Optional<Task> obj = repository.findById(id);
		return obj.get();
	}
	
	
	public List<TaskDTO> getTaskEntreAnos(Date anoInicial, Date anoFinal){
		try { 
		List<TaskDTO> projecthistories = 
				repository.findByStartDateBetween(anoInicial, anoFinal);		
		return projecthistories;
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(anoInicial);
		}
	}
	
	public List<TaskDTO> getTaskPorStatusEntreAnos(int status,Date anoInicial, Date anoFinal){
		try { 
		List<TaskDTO> projecthistories = 
				repository.findTaskByStatusAndStartDateBetween(status, anoInicial, anoFinal);	
		return projecthistories;
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(anoInicial);
		}
	}
	
	public List<TaskDTO> getTaskPorTaskPoints(int taskPoints, int taskPoints2){
		try { 
		List<TaskDTO> projecthistories = 
				repository.findByTaskPointsBetween(taskPoints, taskPoints2);	
		return projecthistories;
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(taskPoints);
		}
	}
}
