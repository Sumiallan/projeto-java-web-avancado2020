package com.example.projectweb.services.dto;

import java.util.Date;

import com.example.projectweb.domain.Person;
import com.fasterxml.jackson.annotation.JsonFormat;

public class PersonDTO {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date   hireDate;
	
	public PersonDTO(Person person) {
		
		id = person.getId();
		firstName = person.getFirstName();
		lastName = person.getLastName();
		email = person.getEmail();
		phoneNumber = person.getPhoneNumber();
		hireDate = person.getHireDate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
}
