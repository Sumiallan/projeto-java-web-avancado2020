package com.example.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectweb.domain.Project;

public interface ProjectRepository  extends JpaRepository<Project, Long>{

}
