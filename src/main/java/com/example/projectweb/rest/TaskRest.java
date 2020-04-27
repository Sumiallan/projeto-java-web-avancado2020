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

import com.example.projectweb.domain.Task;
import com.example.projectweb.services.TaskService;
import com.example.projectweb.services.dto.TaskDTO;

@RestController
@RequestMapping(value = "/api")
public class TaskRest {
	
	SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
	@Autowired
	private TaskService service;
	
	@GetMapping("/tasks")
	public ResponseEntity<List<Task>> findAll(){
		List<Task> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping("/task/{id}")
	public ResponseEntity<Task> findById(@PathVariable Long id){
		Task obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		 
	}
	
	@GetMapping("/tasks/{anoInicial}/{anoFinal}")
	public ResponseEntity<List<TaskDTO>> findByAno(@PathVariable String anoInicial,@PathVariable String anoFinal) throws ParseException{
		List<TaskDTO> obj = service.getTaskEntreAnos(formataData.parse(anoInicial),formataData.parse(anoFinal));
		return ResponseEntity.ok().body(obj);
		 
	}
	
	@GetMapping("/tasks/{status}/{anoInicial}/{anoFinal}")
	public ResponseEntity<List<TaskDTO>> findTaskByStatusAndAno(@PathVariable int status,@PathVariable String anoInicial,@PathVariable String anoFinal) throws ParseException{
		List<TaskDTO> obj = service.getTaskPorStatusEntreAnos(status,formataData.parse(anoInicial),formataData.parse(anoFinal));
		return ResponseEntity.ok().body(obj);
		 
	}
	
	@GetMapping("/task/taskPoints/{taskPoint}/{taskPoint2}")
	public ResponseEntity<List<TaskDTO>> findTaskByTaskPoints(@PathVariable int taskPoint,@PathVariable int taskPoint2){
		List<TaskDTO> obj = service.getTaskPorTaskPoints(taskPoint,taskPoint2);
		return ResponseEntity.ok().body(obj);
		 
	}

}
