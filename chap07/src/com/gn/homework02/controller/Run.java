package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		
		Person person = new Person("01012345678" ,190.5, 100.2);
		Person person2 = new Person("01056434563" ,175.4, 65.6);
		
		
		System.out.println("전화번호: "+person.callNumber +" 키: "+ person.height +" 몸무게 : " +person.weight);
		System.out.println("전화번호: "+person2.callNumber +" 키: "+ person2.height +" 몸무게 : " +person2.weight);
		
		
		Person per = new Person();
		
		per.setName("김철수");
		per.setAddress("경기도");
		per.callNumber = "01012345678";
		per.height = 190.5;
		per.weight = 100.2;
		
		
		
	}
	
}
