package sec05.homework06.controller;

import sec05.homework06.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.calculateRound();
		rectangle.calculateArea();
		
		rectangle.printlnfo();
		
		
		Rectangle rectangle1 = new Rectangle(5,3);
		rectangle1.calculateRound();
		rectangle1.calculateArea();
		
		rectangle1.printlnfo();
		

	}

}
