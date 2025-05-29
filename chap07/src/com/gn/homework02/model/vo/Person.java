package com.gn.homework02.model.vo;

public class Person {

	private String name;
	private String address;
	public String callNumber;
	public double height;
	public double weight;
	
	public Person(){
		
	}
	
	
	public Person(String callNumber, double height, double weight){
		this.callNumber = callNumber;
		this.height = height;
		this.weight = weight;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String x) {
		name = x;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
