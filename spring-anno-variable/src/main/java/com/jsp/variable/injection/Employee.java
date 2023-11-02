package com.jsp.variable.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value(value = "102")
	int id;
	@Value(value = "xyz")
	String name;
	@Value(value = "xyz@mail.com")
	String email; 
	
	public void Employee() {
		System.out.println("employee created.....");
	}
	
	
	public void printEmpDetail() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}

}
