package homework;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		float language = sc.nextFloat();
		System.out.println("영어 점수를 입력하세요");
		float english = sc.nextFloat();
		System.out.println("수학 점수를 입력하세요");
		float math = sc.nextFloat();
		
		int sum = (int)language + (int)english + (int)math;
		int average = ((int)language + (int)english + (int)math)/ 3;
		
		System.out.println("국어 :" + (int)language);
		System.out.println("영어 :" + (int)english);
		System.out.println("수학 :" + (int)math);
		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + average);
	}
}
