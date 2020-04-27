package com.example.projectweb.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.projectweb.domain.ProjectHistory;
import com.example.projectweb.repositories.ProjectHistoryRepository;
import com.example.projectweb.services.dto.ProjectHistoryDTO;
import com.example.projectweb.services.exceptions.ResourceNotFoundException;

@Service
public class ProjectHistoryService {
	
	@Autowired
	private ProjectHistoryRepository repository;
	
	public List<ProjectHistory> findAll(){
		return repository.findAll();
		
	}
		
	public ProjectHistoryDTO findById(Long id) {
		try {
			Optional<ProjectHistory> obj = repository.findById(id);
			return new ProjectHistoryDTO(obj.get());
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
	}
		
	public List<ProjectHistoryDTO> getProjectHistoryEntreAnos(Date anoInicial, Date anoFinal){
		try { 
		List<ProjectHistoryDTO> projecthistories = 
				repository.findByStartDateBetween(anoInicial, anoFinal);		
		return projecthistories;
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(anoInicial);
		}
		
	}

}
