package com.example.projectweb.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectweb.domain.ProjectHistory;
import com.example.projectweb.services.ProjectHistoryService;
import com.example.projectweb.services.dto.ProjectHistoryDTO;

@RestController
@RequestMapping(value = "/api")
public class ProjectHistoryRest {
	SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
	@Autowired
	private ProjectHistoryService service;
	
	@GetMapping("/projecthistories")
	public ResponseEntity<List<ProjectHistory>> findAll(){
		List<ProjectHistory> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping("/projecthistory/{id}")
	public ResponseEntity<ProjectHistoryDTO> findById(@PathVariable Long id){
		ProjectHistoryDTO obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		 
	}
	
	@GetMapping("/projecthistoryAno/{anoInicial}/{anoFinal}")
	public ResponseEntity<List<ProjectHistoryDTO>> findByAno(@PathVariable String anoInicial,@PathVariable String anoFinal) throws ParseException{
		List<ProjectHistoryDTO> obj = service.getProjectHistoryEntreAnos(formataData.parse(anoInicial),formataData.parse(anoFinal));
		return ResponseEntity.ok().body(obj);
		 
	}

	
	
}
