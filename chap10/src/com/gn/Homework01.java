package com.gn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ran = (int)(Math.random()*50)+1;
		int num = 0;
		int count = 0;
		
		
		while(true) {
			try {
				System.out.print("1~50사이의 숫자 : ");
				
				num = sc.nextInt();
				count++;
				
				if(ran == num) {
					System.out.println("축하합니다~ 정답이에요");
					break;
				} else if(num > ran) {
					System.out.println("Down!");
				
				} else if(num < ran) {
					System.out.println("Up!");
					
				}
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				sc.nextLine();
				count++;
			}
			
		}
		System.out.println(count);
	}
}
