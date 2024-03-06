package com.EmployeeManagementSystem;

public class Main {

	public static void main(String[] args) {
		
		FrontDeskEmployee frontDeskEmployee = new FrontDeskEmployee("Mahesh💞" , 1 , 2000.0);
		
		HouseKeepingEmployee houseKeepingEmployee = new HouseKeepingEmployee("Rupesh🎭" , 2 , 1800.0);
		
		KitchenStaffEmployee  kitchenStaffEmployee = new KitchenStaffEmployee("Vaibhav💓" , 3 , 2300.0);
		
		MaintainanceEmployee maintainanceEmployee = new MaintainanceEmployee("Shantilal🫂" , 4 , 2100.0);
		
		
		frontDeskEmployee.checkInGuest();
        houseKeepingEmployee.cleanRoom();
        kitchenStaffEmployee.prepareFood();
        maintainanceEmployee.performMaintainance();
	}
	

}
