package homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게를 입력해주세요:");
		float kg = sc.nextFloat();
		
		System.out.print("키를 입력해주세요:");
		float height = sc.nextFloat() / 100;
		
		float bmi = kg / (height * height);
		
		
		System.out.printf("BMI지수는 %.1f 입니다." , bmi);
	}
}
