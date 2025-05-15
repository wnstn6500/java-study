package sec02.homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("친구 수: ");
		int friendsCount = sc.nextInt();
		System.out.print("사탕의 수: ");
		int candyCount = sc.nextInt();
		
		int personCount = candyCount / friendsCount;
		int remainCandyCount = candyCount % friendsCount;
		
		System.out.println("1인당 사탕 개수: " + personCount + "개");
		System.out.println("남는 사탕 개수 : " + remainCandyCount + "개");
		
	}
}
