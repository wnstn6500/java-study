package sec01.homework01.model.vo;

public class Employee extends Person{
	int salary;
	String dept;
	
	public Employee(){
		
	}
	
	public Employee(String name, int age, double height, double weight, 
			int salary, String dept){
		this.name = name;
		setAge(age);
		setHeight(height);
		setWeight(weight);
		getAge();
		getHeight();
		getWeight();
		this.salary = salary;
		this.dept = dept;
	}
	
	public void toString(String name) {
		
	}
	
}
