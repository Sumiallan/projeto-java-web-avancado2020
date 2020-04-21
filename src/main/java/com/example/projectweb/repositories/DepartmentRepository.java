package com.example.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectweb.domain.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	

}
