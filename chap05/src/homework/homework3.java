package homework;

import java.util.Scanner;



public class homework3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		
		while(num < 3 || num % 2 == 0) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			num = sc.nextInt();
		}
		int[] score = new int[num];
		int minus = 1;
		
		for (int i = 0; i < score.length; i++) {
			if(i < (score.length / (double)2)) {
				score[i] = i + 1;
			}	
			else if(i >= (score.length / (double)2)) {
				score[i] = i - minus;
				minus+= 2;
			}
		}
		for (int j = 0; j < score.length; j++) {
			if(j == score.length -1 ) {
				System.out.println(score[j]);
				break;
			}
			System.out.print(score[j] + " , ");
		}
		
	}
	
	
}
