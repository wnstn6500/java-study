package sec05.homework09.controller;

import sec05.homework09.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		Student student = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student.setName("김철수");
		student.setClassName('A');
		
		student2.setName("홍길동");
		student2.setClassName('F');
		
		student3.setName("이영희");
		student3.setClassName('B');

		System.out.println(student.getClassNum()+ " " + student.getName() + " " +student.getClassName());
		System.out.println(student2.getClassNum()+ " " + student2.getName() + " " +student2.getClassName());
		System.out.println(student3.getClassNum()+ " " + student3.getName() + " " +student3.getClassName());
	}
}
