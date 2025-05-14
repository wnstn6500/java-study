package homework;

import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요: ");
		char number = sc.nextLine().charAt(0);
//		int num = Character.getNumericValue(number);
		int num = number - '0';
		int square = (int)Math.pow(num, 2);
		System.out.println("입력한 숫자의 제곱은 " + square + "입니다.");
	}
}
