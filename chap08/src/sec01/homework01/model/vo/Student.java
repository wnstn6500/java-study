package sec01.homework01.model.vo;

public class Student extends Person{

	private int grade;
	private String major;
	
	public Student(){
		
	}
	
	public Student(String name, int age, double height, double weight, 
			int grade, String major){
		this.name = name;
		setAge(age);
		setHeight(height);
		setWeight(weight);
		getAge();
		getHeight();
		getWeight();
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "=== " + name + " ===" + "\n나이: " + getAge() + "\n키 : " + getHeight() + "\n몸무게 : "
				+ getWeight() + " \n학년 : "+ grade + "\n전공 : " + major; 
	}
	
}
