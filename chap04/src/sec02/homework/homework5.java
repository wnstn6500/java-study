package sec02.homework;


import java.util.Scanner;

public class homework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
	
		System.out.print("숫자(0을 입력하면 종료) : ");
		int num = sc.nextInt();
		
		while(num != 0) {
			if(num < 0) {
				System.out.print("숫자(0을 입력하면 종료) : ");
				num = sc.nextInt();
				continue;
			}
			sum += num;
			System.out.print("숫자(0을 입력하면 종료) : ");
			num = sc.nextInt();
			if(num == 0) {
				System.out.println("양수의 합계: " + sum);
				break;
			}
			
		}
		
		
	}
	
	
}
