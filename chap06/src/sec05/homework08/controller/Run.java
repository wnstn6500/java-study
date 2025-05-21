package sec05.homework08.controller;

import sec05.homework08.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		Person person = new Person("김철수", 20);
		
		
		
		System.out.println(person.name + "는 " + person.age + "살 입니다.");
		
	}
}
