package com.rohit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	List<Employee> list;
	public EmployeeRepository(){
		list = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setId(100);
		emp1.setName("rohit");
		emp1.setSalary(20000);
		emp2.setId(101);
		emp2.setName("sumit");
		emp2.setSalary(30000);
		list.add(emp1);
		list.add(emp2);
	}
	public List<Employee> getEmployee(){
		return list;
	}
	public Employee getEmployee(int id) {
		Employee emp = new Employee();
		for(Employee e: list) {
			if(e.getId() == id) {
				return e;
			}
		}
		return emp;
	}
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		list.add(emp);
		return emp;
		
	}
}
