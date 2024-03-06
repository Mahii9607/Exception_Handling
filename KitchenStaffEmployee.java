package com.EmployeeManagementSystem;

public class KitchenStaffEmployee extends Employee {

public KitchenStaffEmployee(String name , int id , double salary) {
	super(name, id , salary);
	
}
@Override
 public void work() {
	System.out.println(getName() + " is working in the kitchen.");
	
}

public void prepareFood() {
	System.out.println(getName() + " is preparing food.");
	System.out.println();
	
}

}
