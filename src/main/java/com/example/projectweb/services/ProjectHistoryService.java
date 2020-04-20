package com.example.projectweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectweb.entites.ProjectHistory;
import com.example.projectweb.repositories.ProjectHistoryRepository;

@Service
public class ProjectHistoryService {
	
	@Autowired
	private ProjectHistoryRepository repository;
	
	public List<ProjectHistory> findAll(){
		return repository.findAll();
		
	}
	
	public ProjectHistory findById(Long id) {
		Optional<ProjectHistory> obj = repository.findById(id);
		return obj.get();
	}
	
	

}
