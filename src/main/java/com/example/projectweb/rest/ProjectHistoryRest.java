package com.example.projectweb.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectweb.domain.Department;
import com.example.projectweb.domain.ProjectHistory;
import com.example.projectweb.services.ProjectHistoryService;

@RestController
@RequestMapping(value = "/api")
public class ProjectHistoryRest {
	
	@Autowired
	private ProjectHistoryService service;
	
	@GetMapping("/projecthistories")
	public ResponseEntity<List<ProjectHistory>> findAll(){
		List<ProjectHistory> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping("/projecthistory/{id}")
	public ResponseEntity<ProjectHistory> findById(@PathVariable Long id){
		ProjectHistory obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		 
	}

}
