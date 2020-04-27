package com.example.projectweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.projectweb.domain.Project;
import com.example.projectweb.repositories.ProjectRepository;
import com.example.projectweb.services.dto.ProjectDTO;
import com.example.projectweb.services.exceptions.ResourceNotFoundException;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository repository;
	
	public List<Project> findAll(){
		return repository.findAll();
		
	}	
	public ProjectDTO findById(Long id) {
		try {
			Optional<Project> obj = repository.findById(id);
			return new ProjectDTO(obj.get());
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	
}
