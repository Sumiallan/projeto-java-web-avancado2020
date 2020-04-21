package com.example.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectweb.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
