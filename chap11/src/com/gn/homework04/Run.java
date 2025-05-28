package com.gn.homework04;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		String s = "";
		
		
		while(true) {
			System.out.print("문자열 : ");
			s = sc.next();
			
			if(s.equalsIgnoreCase("n")) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("최종 문자열 : " + str);
				break;
			} else {
				str += s;
			}
		}
	}
}
