package com.example.projectweb.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.projectweb.domain.Person;
import com.example.projectweb.repositories.PersonRepository;
import com.example.projectweb.services.dto.PersonDTO;
import com.example.projectweb.services.exceptions.DatabaseException;
import com.example.projectweb.services.exceptions.ResourceNotFoundException;

@Service
public class PersonService {
	@Autowired
	private PersonRepository repository;
	
	public List<Person> findAll(){
		return repository.findAll();
		
	}
	public PersonDTO findById(Long id) {
		try {
			Optional<Person> obj = repository.findById(id);
			return new PersonDTO(obj.get());
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	public Person insert(Person person) {
		return repository.save(person);
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
	
	public Person update(Long id, Person person) {
		try {		
			Person entity = repository.getOne(id);
			updateData(entity,person);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		 
	}
	private void updateData(Person entity, Person person) {
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setEmail(person.getEmail());
		entity.setPhoneNumber(person.getPhoneNumber());
		
		
	}
	

}
