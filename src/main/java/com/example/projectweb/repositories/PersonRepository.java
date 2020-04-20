package com.example.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectweb.entites.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
