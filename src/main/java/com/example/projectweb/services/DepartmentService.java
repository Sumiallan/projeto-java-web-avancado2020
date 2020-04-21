package com.example.projectweb.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.projectweb.domain.Department;
import com.example.projectweb.repositories.DepartmentRepository;
import com.example.projectweb.services.dto.DepartmentDTO;
import com.example.projectweb.services.exceptions.DatabaseException;
import com.example.projectweb.services.exceptions.ResourceNotFoundException;


@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	public List<Department> findAll(){
		return repository.findAll();
		
	}
	public DepartmentDTO findById(Long id) {
		try {
			Optional<Department> obj = repository.findById(id);
			return new DepartmentDTO(obj.get());
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	
	public Department insert(Department department) {
		return repository.save(department);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Department update(Long id, Department department) {
		try {		
			Department entity = repository.getOne(id);
			updateData(entity,department);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		 
	}
	private void updateData(Department entity, Department department) {
		entity.setDepartmentName(department.getDepartmentName());
	}
	
}
