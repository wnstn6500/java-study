package sec05.homework09.model.vo;

public class Student {
	private int classNum;
	private String name;
	private char className;
	
	static int count = 0;
	
	
	public Student() {
		count++;
		classNum = count;
	}
	
	public int getClassNum() {
		return classNum;
	}
	
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getClassName() {
		return className;
	}
	
	public void setClassName(char className) {
		this.className = className;
	}
	
	
	
}
