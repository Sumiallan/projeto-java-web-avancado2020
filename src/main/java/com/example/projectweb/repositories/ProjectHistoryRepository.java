package com.example.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectweb.domain.ProjectHistory;

public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory,Long> {

}
