package sec03.exam04.quiz;

public class Animal {
	String kind;
	int age;
	
	Animal(String kind, int age){
		this.kind = kind;
		this.age = age;
	}
	Animal(String kind){
		this(kind,1);
	}
	Animal(int age){
		this("사람",age);
	}
	
	
	// 출력 메소드
		void info() {
			System.out.println(kind+": " +age+"살");
		}
}
