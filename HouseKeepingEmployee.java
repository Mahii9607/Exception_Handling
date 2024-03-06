package com.EmployeeManagementSystem;

public class HouseKeepingEmployee extends Employee {

	public HouseKeepingEmployee(String name , int id , double salary) {
	super(name , id , salary);
	}

	@Override
	public void work() {
		
		System.out.println(getName() + " is cleaning rooms.");
		
	}
	
	public void cleanRoom() {
		System.out.println(getName() + " is cleaning a room. ");
		System.out.println();
	}
}
