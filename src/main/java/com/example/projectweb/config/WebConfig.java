package com.example.projectweb.config;

import java.text.SimpleDateFormat;
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
import com.example.projectweb.entites.enums.TaskState;
import com.example.projectweb.repositories.DepartmentRepository;
import com.example.projectweb.repositories.PersonRepository;
import com.example.projectweb.repositories.ProjectHistoryRepository;
import com.example.projectweb.repositories.ProjectRepository;
import com.example.projectweb.repositories.TaskRepository;

@Configuration
public class WebConfig implements CommandLineRunner {
	SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
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
		
				
		Person pe1 =  new Person(null, "MICHAEL", "FASSBENDER", "michael@gmail.com", "(83)-9999-99999", formataData.parse("26-01-2019"));
		Person pe2 =  new Person(null, "BRUCE", "WILLIS", "bruce@gmail.com", "(83)-9999-99999", formataData.parse("26-01-2019"));
		Person pe3 =  new Person(null, "Arnold", "Schwarzenegger", "Arnold@gmail.com", "(83)-9999-99999", formataData.parse("26-02-2019"));
		Person pe4 =  new Person(null, "Kaique", "Leonardo", "Kaique@gmail.com", "(83)-9999-99999", formataData.parse("26-02-2019"));
		Person pe5 =  new Person(null, "Leonardo", "Marcos", "Leonardo@gmail.com", "(83)-9999-99999", formataData.parse("26-03-2019"));
		Person pe6 =  new Person(null, "Vitoria", "Allana", "Vitória@gmail.com", "(83)-9999-99999", formataData.parse("26-03-2019"));
		Person pe7 =  new Person(null, "Thales", "Mário", "Thales@gmail.com", "(83)-9999-99999", formataData.parse("26-04-2019"));
		Person pe8 =  new Person(null, "Pietro", "Joao", "Pietro@gmail.com", "(83)-9999-99999", formataData.parse("26-04-2019"));
		Person pe9 =  new Person(null, "Arthur", "Daniel", "Arthur@gmail.com", "(83)-9999-99999", formataData.parse("26-05-2019"));
		Person pe10 =  new Person(null, "Caio", "Guilherme", "Caio@gmail.com", "(83)-9999-99999", formataData.parse("26-05-2019"));
		Person pe11 =  new Person(null, "Gabriel", "Fábio", "Gabriel@gmail.com", "(83)-9999-99999", formataData.parse("26-06-2019"));
		Person pe12 =  new Person(null, "Brenda", "Maya", "Brenda@gmail.com", "(83)-9999-99999", formataData.parse("26-06-2019"));
		Person pe13 =  new Person(null, "Tatiane", "Sueli", "Tatiane@gmail.com", "(83)-9999-99999", formataData.parse("26-07-2019"));
		Person pe14 =  new Person(null, "Yuri", "Anderson", "Yuri@gmail.com", "(83)-9999-99999", formataData.parse("26-07-2019"));
		Person pe15 =  new Person(null, "Nicole", "Jaqueline", "Nicole@gmail.com", "(83)-9999-99999", formataData.parse("26-08-2019"));
		Person pe16 =  new Person(null, "Tiago", "Manoel", "Tiago@gmail.com", "(83)-9999-99999", formataData.parse("26-08-2019"));
		Person pe17 =  new Person(null, "Luzia", "Emanuelly", "Luzia@gmail.com", "(83)-9999-99999", formataData.parse("26-09-2019"));
		Person pe18 =  new Person(null, "Renato", "Matheus", "Renato@gmail.com", "(83)-9999-99999", formataData.parse("26-09-2019"));
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
		
		Task t1 = new Task(null, "Tarefa 1", "Tarefa 1 Criada",30, 1,formataData.parse("10-01-2020"), formataData.parse("10-03-2020"));
		Task t2 = new Task(null, "Tarefa 2", "Tarefa 2 Criada", 50, 2,formataData.parse("15-02-2020"),formataData.parse("10-04-2020"));		
		Task t3 = new Task(null, "Tarefa 3", "Tarefa 3 Criada", 90, 1,formataData.parse("20-01-2020"), formataData.parse("27-01-2020"));
		Task t4 = new Task(null, "Tarefa 4", "Tarefa 4 Criada", 120, 2,formataData.parse("29-03-2020"),formataData.parse("27-06-2020"));
		Task t5 = new Task(null, "Tarefa 5", "Tarefa 5 Criada",84, 1,formataData.parse("15-01-2020"), formataData.parse("25-03-2020"));
		Task t6 = new Task(null, "Tarefa 6", "Tarefa 6 Criada", 60, 2,formataData.parse("15-02-2020"),formataData.parse("21-07-2020"));		
		Task t7 = new Task(null, "Tarefa 7", "Tarefa 7 Criada", 79, 1,formataData.parse("11-01-2020"), formataData.parse("27-01-2020"));
		Task t8 = new Task(null, "Tarefa 8", "Tarefa 8 Criada", 22, 2,formataData.parse("23-03-2020"),formataData.parse("16-06-2020"));
		Task t9 = new Task(null, "Tarefa 9", "Tarefa 9 Criada",10, 1,formataData.parse("01-01-2020"), formataData.parse("19-03-2020"));
		Task t10 = new Task(null, "Tarefa 10", "Tarefa 10 Criada", 150, 2,formataData.parse("15-07-2020"),formataData.parse("10-08-2020"));		
		Task t11 = new Task(null, "Tarefa 11", "Tarefa 11 Criada", 45, 1,formataData.parse("14-01-2020"), formataData.parse("27-4-2020"));
		Task t12 = new Task(null, "Tarefa 12", "Tarefa 12 Criada", 110, 2,formataData.parse("17-03-2020"),formataData.parse("22-3-2020"));
		taskRepository.saveAll(Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12));
		
		
		
		p1.getTask().add(t1);
		p2.getTask().add(t2);
		p3.getTask().add(t3);
		p4.getTask().add(t4);
		p1.getTask().add(t5);
		p2.getTask().add(t6);
		p3.getTask().add(t7);
		p4.getTask().add(t8);
		p1.getTask().add(t9);
		p2.getTask().add(t10);
		p3.getTask().add(t11);
		p4.getTask().add(t12);
		projectRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
		
		
		
		ProjectHistory  pr1 = new ProjectHistory(null, t1.getStartDate(), t1.getEndDate(), p1.getManager(), dep1, p1);
		ProjectHistory  pr2 = new ProjectHistory(null, t2.getStartDate(), t2.getEndDate(), p2.getManager(), dep2, p2);
		ProjectHistory  pr3 = new ProjectHistory(null, t3.getStartDate(), t3.getEndDate(), p3.getManager(), dep3, p3);
		ProjectHistory  pr4 = new ProjectHistory(null, t4.getStartDate(), t4.getEndDate(), p4.getManager(), dep1, p4);
		projectHistoryRepository.saveAll(Arrays.asList(pr1,pr2,pr3,pr4));
	}
	
	

}
