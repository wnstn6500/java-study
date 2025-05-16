package sec02.exam03;

import java.util.Iterator;
import java.util.Scanner;

public class ForSumFrom1To100Example2 {
	
	public static void main(String[] args) {
		// 1부터 100까지 합
		int sum = 0;
		
		int i = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i - 1) + " 합:" + sum);
		
		// (참고) 무한 루프
		int count = 0;
		for (;;) {
			System.out.println("무한 반복");
			count++;
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				break;
			}
		}
		
		// Quiz: 1부터 100까지 짝수의 합
		int num = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				num += i;
			}
		}
		System.out.println("1부터 100까지 짝수의 합은" + num);
		
		// Quiz2: 
//		숫자를 입력받아 입력받은 수가 
//		짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//		홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//		을 구하는 프로그램을 구현하시오
//
//		[입력]  [출력]
//		 10  => 30
//		 11  => 36
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		int num2 = 0;


		if (num1 % 2 == 0) {
			for(i = 2; i <= num1; i++) {
				if(i % 2 == 0) {
					num2 += i;
				}
			}
		} else {
			for(i = 1; i <= num1; i++) {
				if(i % 2 == 1) {
					num2 += i;
				}
			}
		}
		System.out.println((i-num1)+"부터" + num1 + "까지 숫자의 합은" + num2 + "입니다.");
		
	}
	
}
