package homework;



import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] score = new int[num];
		int sum = 0;
		
		
		for(int i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		for (int j = 0; j < score.length; j++) {
			
			System.out.print(score[j] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		
	}
	
	
}
