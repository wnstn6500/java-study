package sec01.homework01.model.vo;

public class Employee extends Person{
	int salary;
	String dept;
	
	public Employee(){
		
	}
	
	public Employee(String name, int age, double height, double weight, 
			int salary, String dept){
		setAge(age);
		setHeight(height);
		setWeight(weight);
	}
	
	public void toString(String name) {
		
	}
	
}
