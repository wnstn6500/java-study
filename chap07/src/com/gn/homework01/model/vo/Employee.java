package com.gn.homework01.model.vo;

public class Employee {
	
	public String name;
	public String team;
	protected String position;
	protected int salary;
	private int bonus;

	public Employee(String name, String team, String position, int salary, int bonus){
		
	}
	
	public Employee(String name, String team){
		this.name = name;
		this.team = team;
	}
	
	
}
