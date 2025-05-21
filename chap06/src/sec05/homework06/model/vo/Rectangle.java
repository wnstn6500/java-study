package sec05.homework06.model.vo;

public class Rectangle {

	int width = 1;
	int height = 1;
	int round = 0;
	int area = 0;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		round = (width)*2 + (height*2);
		return round; 
	}
	
	public int calculateArea() {
		area = (width*height);
		return area;
	}
	
	public void printlnfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레");
		System.out.println(round + "cm");
		System.out.println("2. 사각형의 넓이");
		System.out.println(area + "cm");
		
	}
}
