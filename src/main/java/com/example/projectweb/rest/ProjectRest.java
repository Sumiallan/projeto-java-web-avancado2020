package com.example.projectweb.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectweb.domain.Project;
import com.example.projectweb.services.ProjectService;
import com.example.projectweb.services.dto.ProjectDTO;

@RestController
@RequestMapping(value = "/api")
public class ProjectRest {
	
	@Autowired
	private ProjectService service;
	
	@GetMapping("/projects")
	public ResponseEntity<List<Project>> findAll(){
		List<Project> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping("/project/{id}")
	public ResponseEntity<ProjectDTO> findById(@PathVariable Long id){
		ProjectDTO obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		 
	}

}
