package com.brainmentors.ems.employees;

import java.util.Scanner;

import com.brainmentors.ems.employees.dao.EmployeeDAO;

public class EmployeeRegisterView {//extends EmployeeDAO {
	
	// It has Input Logic
	void registerEmployee(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the EmployeeId ");
		int id = scanner.nextInt();
		//empDTO.setId(scanner.nextInt());
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Enter the Bonus");
		double bonus = scanner.nextDouble();
		EmployeeDTO empDTO = new EmployeeDTO();
		empDTO.setId(id);
		empDTO.setName(name);
		empDTO.setSalary(salary);
		empDTO.setBonus(bonus);
		//registerEmployeeInDB(id, name);
		EmployeeDAO dao = new EmployeeDAO();
		DeptDTO deptDTO = dao.registerEmployeeInDB(empDTO);
		System.out.println("Now Updated Salary is "+empDTO.getSalary());
		System.out.println("Congrat Employee U Register SuccessFully");
		System.out.println("Following are UR Dept Info...");
		System.out.println("Id "+deptDTO.getId());
		System.out.println("Name "+deptDTO.getName());
		System.out.println("ManagerName "+deptDTO.getManagerName());
		System.out.println("Timing "+deptDTO.getTiming());
		
		//dao.registerEmployeeInDB(id,name,salary,bonus);
		//dao.makeConnection();
		
	}
	public static void main(String[] args) {
		EmployeeRegisterView view = new EmployeeRegisterView();
		view.registerEmployee();
	}

}
