package com.rohit.restAPIDemo;
import jakarta.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Employee {
	private String name;
	private int salary;
	private float id;
	public Employee(String name, int salary, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public float getId() {
		return id;
	}
	
}
