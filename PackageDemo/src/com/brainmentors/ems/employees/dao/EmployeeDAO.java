package com.brainmentors.ems.employees.dao;

import com.brainmentors.ems.employees.DeptDTO;
import com.brainmentors.ems.employees.EmployeeDTO;

public class EmployeeDAO {
	private int maxConnection = 10;
	int makeConnection(){
		System.out.println("Connection Created....");
		return 10;
	}
	public  DeptDTO registerEmployeeInDB(EmployeeDTO employeeDTO){
		makeConnection();
		System.out.println("Employee is Store in DB "+employeeDTO.getId()+" Name "+employeeDTO.getName()+" Salary "+employeeDTO.getSalary()+" Bonus "+employeeDTO.getBonus());
		employeeDTO.setSalary(employeeDTO.getSalary()+1000);
		DeptDTO deptDTO = new DeptDTO();
		deptDTO.setId(1001);
		deptDTO.setName("IT");
		deptDTO.setManagerName("Ram");
		deptDTO.setTiming("10AM");
		return deptDTO;
	}
}
