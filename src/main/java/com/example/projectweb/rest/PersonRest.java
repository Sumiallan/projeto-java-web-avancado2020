package com.example.projectweb.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectweb.domain.Person;
import com.example.projectweb.services.PersonService;
import com.example.projectweb.services.dto.PersonDTO;

@RestController
@RequestMapping(value = "/api")
public class PersonRest {
	@Autowired
	private PersonService service;
	
	@GetMapping("/persons")
	public ResponseEntity<List<Person>> findAll(){
		List<Person> list = service.findAll();
		//expressão lambida, convertendo para stream para ser compativel com a expressão lambida
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping("/person/{id}")
	public ResponseEntity<PersonDTO> findById(@PathVariable Long id){
		PersonDTO obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		 
	}

	@PostMapping("/person")
	public ResponseEntity<Person> insert(@RequestBody Person person){
		person = service.insert(person);
		return ResponseEntity.ok().body(person);
	}
	
	@DeleteMapping("/person/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}
	
	@PutMapping("/person/{id}")
	public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person person){
		service.update(id, person);
		return ResponseEntity.ok().build();
		
	}
	
}
