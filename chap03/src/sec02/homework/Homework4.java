package sec02.homework;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 :");
		int language = sc.nextInt();
		System.out.print("수학 :");
		int math = sc.nextInt();
		System.out.print("영어 :");
		int english = sc.nextInt();
		
		int sum = language + math + english;
		int average = sum / 3;
		
		
		
		
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + average);
		if (language >= 60 && math >= 60 && english >= 60 && average >= 90) {
			System.out.println("휴대폰을 바꿀 수 있습니다.");
		} else {
			System.out.println("휴대폰을 바꿀 수 없습니다.");
		}
		
		
	}
}
