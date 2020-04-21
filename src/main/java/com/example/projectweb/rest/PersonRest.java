package com.example.projectweb.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectweb.entites.Person;
import com.example.projectweb.services.PersonService;

@RestController
@RequestMapping(value = "/api")
public class PersonRest {
	@Autowired
	private PersonService service;
	
	@GetMapping("/persons")
	public ResponseEntity<List<Person>> findAll(){
		List<Person> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping("/person/{id}")
	public ResponseEntity<Person> findById(@PathVariable Long id){
		Person obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		 
	}

	
	
}
