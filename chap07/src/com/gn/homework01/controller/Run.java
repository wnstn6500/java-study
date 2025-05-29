package com.gn.homework01.controller;

import com.gn.homework01.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee employee = new Employee("김철수","교육운영팀");
		Employee employee2 = new Employee("이영희","경영지원팀");
		
		
		System.out.println(employee.name + " " +employee.team);
		System.out.println(employee2.name+ " "+employee2.team);
		
	}
	
	
	
	
}
