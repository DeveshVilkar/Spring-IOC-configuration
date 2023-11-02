package com.jsp.constructor.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	 int id;
	 String name;
	 String email;
	
	public Student(@Value(value = "1") int id,@Value(value = "devesh") String name,@Value(value = "devesh@mail.com")String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public void printDetail() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}

}
