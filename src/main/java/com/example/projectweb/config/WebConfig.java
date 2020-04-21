package com.example.projectweb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.projectweb.domain.Department;
import com.example.projectweb.domain.Person;
import com.example.projectweb.domain.Project;
import com.example.projectweb.domain.ProjectHistory;
import com.example.projectweb.domain.Task;
import com.example.projectweb.entites.enums.Status;
import com.example.projectweb.repositories.DepartmentRepository;
import com.example.projectweb.repositories.PersonRepository;
import com.example.projectweb.repositories.ProjectHistoryRepository;
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
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private ProjectHistoryRepository projectHistoryRepository;

	@Override
	public void run(String... args) throws Exception {
				
		Person pe1 =  new Person(null, "MICHAEL", "FASSBENDER", "michael@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe2 =  new Person(null, "BRUCE", "WILLIS", "bruce@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe3 =  new Person(null, "Arnold", "Schwarzenegger", "Arnold@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe4 =  new Person(null, "Kaique", "Leonardo", "Kaique@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe5 =  new Person(null, "Leonardo", "Marcos", "Leonardo@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe6 =  new Person(null, "Vitoria", "Allana", "Vitória@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe7 =  new Person(null, "Thales", "Mário", "Thales@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe8 =  new Person(null, "Pietro", "Joao", "Pietro@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe9 =  new Person(null, "Arthur", "Daniel", "Arthur@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe10 =  new Person(null, "Caio", "Guilherme", "Caio@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe11 =  new Person(null, "Gabriel", "Fábio", "Gabriel@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe12 =  new Person(null, "Brenda", "Maya", "Brenda@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe13 =  new Person(null, "Tatiane", "Sueli", "Tatiane@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe14 =  new Person(null, "Yuri", "Anderson", "Yuri@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe15 =  new Person(null, "Nicole", "Jaqueline", "Nicole@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe16 =  new Person(null, "Tiago", "Manoel", "Tiago@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe17 =  new Person(null, "Luzia", "Emanuelly", "Luzia@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		Person pe18 =  new Person(null, "Renato", "Matheus", "Renato@gmail.com", "(83)-9999-99999", Instant.parse("2020-01-10T19:53:07Z"));
		personRepository.saveAll(Arrays.asList(pe1,pe2,pe3,pe4,pe5,pe6,pe7,pe8,pe9,pe10,pe11,pe12,pe13,pe14,pe15,pe16,pe17,pe18));
		
		
		Department dep1 = new  Department(null, "Tecnologia");
		Department dep2 = new  Department(null, "Administracao");
		Department dep3 = new  Department(null, "Marketing");
		departmentRepository.saveAll(Arrays.asList(dep1,dep2,dep3));
		
		dep1.getPersons().add(pe1);
		dep1.getPersons().add(pe2);
		dep1.getPersons().add(pe3);
		dep1.getPersons().add(pe4);
		dep1.getPersons().add(pe5);
		dep1.getPersons().add(pe6);
		
		
		dep2.getPersons().add(pe7);
		dep2.getPersons().add(pe8);
		dep2.getPersons().add(pe9);
		dep2.getPersons().add(pe10);
		dep2.getPersons().add(pe11);
		dep2.getPersons().add(pe12);
		
		dep3.getPersons().add(pe13);
		dep3.getPersons().add(pe14);
		dep3.getPersons().add(pe15);
		dep3.getPersons().add(pe16);
		dep3.getPersons().add(pe17);
		dep3.getPersons().add(pe18);
		
		departmentRepository.saveAll(Arrays.asList(dep1,dep2,dep3));
		
		
		Project p1 = new Project(null, "Prometheus", pe1 , 1000, 2000);
		Project p2 = new Project(null, "Armageddon", pe2, 20000, 30000);
		Project p3 = new Project(null, "Predador", pe3, 30000, 40000);
		Project p4 = new Project(null, "Apocalipse", pe4, 500000, 700000);
		projectRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
		
		pe1.getProject().add(p1);
		pe2.getProject().add(p2);
		pe3.getProject().add(p3);
		pe4.getProject().add(p4);
		personRepository.saveAll(Arrays.asList(pe1,pe2,pe3,pe4));
		
		Task t1 = new Task(null, "Tarefa 1", "Projeto 1 Criado", "Projeto Em Aberto 1", Status.OPEN,Instant.parse("2020-02-20T19:53:07Z"), null);
		Task t2 = new Task(null, "Tarefa 2", "Projeto 2 Criado", "Projeto Fechado 2", Status.CLOSED,Instant.parse("2020-02-15T19:53:07Z"), Instant.parse("2020-04-18T19:53:07Z"));		
		Task t3 = new Task(null, "Tarefa 3", "Projeto 3 Criado", "Projeto Em Aberto 3", Status.OPEN,Instant.parse("2020-02-10T19:53:07Z"), null);
		Task t4 = new Task(null, "Tarefa 4", "Projeto 4 Criado", "Projeto Fechado 4", Status.CLOSED,Instant.parse("2020-02-10T19:53:07Z"), Instant.parse("2020-04-14T19:53:07Z"));
		taskRepository.saveAll(Arrays.asList(t1,t2,t3,t4));
		
		
		
		p1.getTask().add(t1);
		p2.getTask().add(t2);
		p3.getTask().add(t3);
		p4.getTask().add(t4);
		projectRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
		
		
		
		ProjectHistory  pr1 = new ProjectHistory(null, t1.getStartDate(), t1.getEndDate(), p1.getManager(), dep1, p1);
		ProjectHistory  pr2 = new ProjectHistory(null, t2.getStartDate(), t2.getEndDate(), p2.getManager(), dep2, p2);
		ProjectHistory  pr3 = new ProjectHistory(null, t3.getStartDate(), t3.getEndDate(), p3.getManager(), dep3, p3);
		ProjectHistory  pr4 = new ProjectHistory(null, t4.getStartDate(), t4.getEndDate(), p4.getManager(), dep1, p4);
		projectHistoryRepository.saveAll(Arrays.asList(pr1,pr2,pr3,pr4));
	}
	
	

}
