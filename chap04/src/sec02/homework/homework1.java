package sec02.homework;

import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("정수(1~50) : ");
		int num = sc.nextInt();
		while(num > 50 || num < 1) {
			System.out.println("1~50 사이의 정수를 입력하세요.");
			System.out.print("정수(1~50) : ");
			num = sc.nextInt();
		}
			if(num <= 50 || num > 1) {
				System.out.print("합계 : ");
				for(int i = 1; i <= num; i++) {
					if(i % 2 == 0) {
						sum += i;
					}
				}
				System.out.println(sum);
			}
		
	}
}
