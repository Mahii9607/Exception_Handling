package com.EmployeeManagementSystem;

public class MaintainanceEmployee extends Employee {

	public MaintainanceEmployee(String name , int id , double salary) {
		super(name, id , salary);
		
	}
	
	@Override
	public void work() {
	
	}
	public void performMaintainance() {
		
		System.out.println(getName() + " is performing maintainance.");
	}
}
