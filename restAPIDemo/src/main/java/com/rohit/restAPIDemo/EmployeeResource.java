package com.rohit.restAPIDemo;

import jakarta.ws.rs.GET;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(){
		Employee emp = new Employee("Roht", 20000, 568);
		System.out.println("hello man");
		return emp;
		
	}
}
