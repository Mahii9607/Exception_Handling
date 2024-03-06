package com.EmployeeManagementSystem;

public class Employee {

	String name;
	int id;
	double salary;
	
	public Employee(String name , int id , double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	public void work() {
		System.out.println(name + "is working." );
		
		
	}
	
	public String getName() {
		return name;
	}
	

}
