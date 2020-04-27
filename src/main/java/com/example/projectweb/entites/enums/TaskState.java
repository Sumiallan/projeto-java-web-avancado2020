package com.example.projectweb.entites.enums;

public enum TaskState {

	OPEN(1),
	CLOSED(2);

	private int code;
	
	private  TaskState(int code) {
		this.code = code;	
	}


}
