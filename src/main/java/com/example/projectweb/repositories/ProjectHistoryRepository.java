package com.example.projectweb.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectweb.domain.ProjectHistory;
import com.example.projectweb.services.dto.ProjectHistoryDTO;

public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory,Long> {
	
	
   List<ProjectHistoryDTO> findByStartDateBetween(Date anoInicial, Date anoFinal);


 
}
