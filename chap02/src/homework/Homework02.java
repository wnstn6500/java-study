package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float width = sc.nextFloat();
		float height = sc.nextFloat();
		
		float area = width * height;
		float round = (width + height)*2;
		
		System.out.println("가로:" + width);
		System.out.println("가로:" + height);
		System.out.println("가로:" + area);
		System.out.println("가로:" + round);
	}
}
