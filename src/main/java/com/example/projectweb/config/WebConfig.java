package com.example.projectweb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.projectweb.entites.Person;
import com.example.projectweb.entites.Project;
import com.example.projectweb.entites.Task;
import com.example.projectweb.entites.enums.Status;
import com.example.projectweb.repositories.PersonRepository;
import com.example.projectweb.repositories.ProjectRepository;
import com.example.projectweb.repositories.TaskRepository;

@Configuration
public class WebConfig implements CommandLineRunner {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {
				
		Person pe1 =  new Person(null, "MICHAEL", "FASSBENDER", "michael@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe2 =  new Person(null, "BRUCE", "WILLIS", "bruce@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe3 =  new Person(null, "Arnold", "Schwarzenegger", "Arnold@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		personRepository.saveAll(Arrays.asList(pe1,pe2,pe3));
		
		
		Project p1 = new Project(null, "Prometheus", pe1 , 1000, 2000);
		Project p2 = new Project(null, "Armageddon", pe2, 20000, 30000);
		Project p3 = new Project(null, "Predador", pe3, 30000, 40000); 
		projectRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		pe1.getProject().add(p1);
		pe2.getProject().add(p2);
		pe3.getProject().add(p3);
		personRepository.saveAll(Arrays.asList(pe1,pe2,pe3));
		
		Task t1 = new Task(null, "Tarefa1", "Criar projeto 1", "Tarefa Em aberto 1", Status.OPEN,Instant.parse("2020-02-20T19:53:07Z"), Instant.parse("2020-04-20T19:53:07Z"));
		Task t2 = new Task(null, "Tarefa2", "Criar projeto 2", "Tarefa feita 2", Status.CLOSED,Instant.parse("2020-02-15T19:53:07Z"), Instant.parse("2020-04-18T19:53:07Z"));		
		Task t3 = new Task(null, "Tarefa3", "Criar projeto 3", "Tarefa Em aberto 3", Status.OPEN,Instant.parse("2020-02-10T19:53:07Z"), Instant.parse("2020-04-14T19:53:07Z"));
		taskRepository.saveAll(Arrays.asList(t1,t2,t3));
		
		
		
		p1.getTask().add(t1);
		p2.getTask().add(t2);
		p3.getTask().add(t3);
		projectRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		
	}
	
	

}
