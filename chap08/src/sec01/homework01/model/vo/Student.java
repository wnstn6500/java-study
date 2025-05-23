package sec01.homework01.model.vo;

public class Student extends Person{

	private int grade;
	private String major;
	
	public Student(){
		
	}
	
	public Student(String name, int age, double height, double weight, 
			int grade, String major){
		
		setAge(age);
		setHeight(height);
		setWeight(weight);
		getAge();
		getHeight();
		getWeight();
	}
	
	public void toString(String name) {
		
	}
}
