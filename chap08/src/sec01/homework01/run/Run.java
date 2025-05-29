package sec01.homework01.run;

import java.util.Arrays;
import java.util.Scanner;

import sec01.homework01.model.vo.Employee;
import sec01.homework01.model.vo.Student;

public class Run {
	public static final void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;

		Student[] student = new Student[3];
		Employee[] employee = new Employee[10];

		student[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		student[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		student[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");

		for (int i = 0; i < student.length; i++) {

			System.out.println(student[i].toString());
		}
		while (true) {
			System.out.println("=== 사원 입력받기 ===");

			System.out.print("이름: ");
			String name = (sc.nextLine());
			System.out.print("나이: ");
			int age = (sc.nextInt());
			sc.nextLine();
			System.out.print("키: ");
			double height = (sc.nextDouble());
			System.out.print("몸무게: ");
			double weight = (sc.nextDouble());
			System.out.print("급여: ");
			int salary = (sc.nextInt());
			sc.nextLine();
			System.out.print("부서: ");
			String dept = (sc.nextLine());

			employee[count] = new Employee(name, age, height, weight, salary, dept);

			System.out.print("계속 추가할 것인가요? (Y/N) : ");
			String answer = sc.nextLine();
			
			if (answer.equalsIgnoreCase("n")) {
				break;
			} else if (answer.equalsIgnoreCase("y")) {
				count++;
				continue;
			}
		}

		

		for (int i = 0; i <= count; i++) {
			System.out.println(employee[i].toString());
		}
	}
}