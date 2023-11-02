package com.jsp.setter.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Car {
	private int id;
	private String name;
	private String color;
	public int getId() {
		return id;
	}
	@Value(value = "1")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value(value = "bmw")
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	@Value(value = "red")
	public void setColor(String color) {
		this.color = color;
	}
	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(color);
	}
	
	

}
