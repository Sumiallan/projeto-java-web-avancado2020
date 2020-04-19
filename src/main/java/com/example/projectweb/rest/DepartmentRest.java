package com.example.projectweb.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectweb.entites.Department;
import com.example.projectweb.services.DepartmentService;

@RestController
@RequestMapping(value = "/api")
public class DepartmentRest {
	
	@Autowired
	private DepartmentService service;
	
	@GetMapping("/departments")
	public ResponseEntity<List<Department>> findAll(){
		List<Department> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping("/department/{id}")
	public ResponseEntity<Department> findById(@PathVariable Long id){
		Department obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		 
	}

}