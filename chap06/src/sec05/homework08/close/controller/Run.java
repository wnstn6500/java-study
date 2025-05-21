package sec05.homework08.close.controller;

import sec05.homework08.close.model.vo.Person;

public class Run {
	public static void main(String[] args) {
	
		Person person = new Person(); 
		
		person.setName("김철수");
		person.setAge(20);
		
		
		System.out.println(person.getName() + "는 " + person.getAge()+ "살 입니다.");
}
}
