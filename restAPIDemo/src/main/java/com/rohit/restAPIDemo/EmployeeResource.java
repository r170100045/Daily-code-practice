package com.rohit.restAPIDemo;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeResource {
	EmployeeRepository emp = new EmployeeRepository();
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("id") int id){
		
		System.out.println("hello man");
		return emp.getEmployee(id);
		
	}
	@POST 
	@Path("post")
	public Employee addEmploye(Employee emp1) {
		System.out.println("post method is called");
		System.out.println(emp1);
		Employee ret =  emp.addEmployee(emp1);
		return ret;
	}

}
