package sec03.exam03.quiz;

public class FormalEmployee extends Employee{
	
	private int empno;
	private int salary;
	
	public FormalEmployee(String name, String dept, 
			int empno, int salary) {
		super("정규직", name, dept);
		this.empno = empno;
		this.salary = salary;
		
	}
	
	@Override
	public int getPay() {
		return salary / 12;
	}
	
	@Override
	public String getInfo() {
		
		return getType()+","+getName()+","+getDept()+","+empno+","+salary;
	}
}

