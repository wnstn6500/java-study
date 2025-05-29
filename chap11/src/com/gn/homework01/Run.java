package com.gn.homework01;

public class Run {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] person1 = str.split("\n");
		
		Person[] people = new Person[person1.length];
		
		for (int i = 0; i < person1.length; i++) {
			
			String[] parts = person1[i].split(",");
			people[i] = new Person();
			people[i].setName(parts[0]);
			people[i].setAge(Integer.parseInt(parts[1]));
			people[i].setAddress(parts[2]);
			people[i].setGender(parts[3].charAt(0));
			
		}
		
		for(Person p : people) {
			System.out.println(p.toString());
		}
		
	}
}
