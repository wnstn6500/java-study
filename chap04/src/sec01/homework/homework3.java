package sec01.homework;

import java.util.Scanner;

public class homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 세개의 정수 비교하기 ===");
		System.out.print("첫 번째 정수 :");
		int firstNum = sc.nextInt();
		System.out.print("두 번째 정수 :");
		int secondNum = sc.nextInt();
		System.out.print("세 번째 정수 :");
		int thirdNum = sc.nextInt();
		
		int minimum = (firstNum < secondNum && firstNum < thirdNum) ? firstNum : 
			(secondNum < thirdNum) ? secondNum : thirdNum;
		System.out.println("세 수 중에서 가장 작은 수는 " + minimum +"입니다.");
	}
}
