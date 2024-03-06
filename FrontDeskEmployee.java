package com.EmployeeManagementSystem;

public class FrontDeskEmployee extends Employee{

	public FrontDeskEmployee(String name, int id, double salary) {
		super(name, id, salary);
		
	}
 @Override
	public void work() {
		System.out.println(getName() + " is assisting guest at front desk.");
	}
	
	
	public void checkInGuest() {
		System.out.println(getName() + " is checking in guests. ");
		System.out.println();
	}
	

}
