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

import com.example.projectweb.domain.Department;
import com.example.projectweb.services.DepartmentService;
import com.example.projectweb.services.dto.DepartmentDTO;

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
	public ResponseEntity<DepartmentDTO> findById(@PathVariable Long id){
		DepartmentDTO obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		 
	}
	

	@PostMapping("/department")
	public ResponseEntity<Department> insert(@RequestBody Department department){
		department = service.insert(department);
		return ResponseEntity.ok().body(department);
	}
	
	@DeleteMapping("/department/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}
	
	@PutMapping("/department/{id}")
	public ResponseEntity<Department> update(@PathVariable Long id, @RequestBody Department department){
		service.update(id, department);
		return ResponseEntity.ok().build();
		
	}

}
