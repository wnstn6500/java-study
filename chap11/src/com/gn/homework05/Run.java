package com.gn.homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("생년월일 : ");
		String birthDay = sc.next();
		
		char first = name.charAt(0);
		String restName = name.substring(1);
		
		String year = birthDay.substring(2, 4);
		String month = birthDay.substring(6, 8);
		
		String password = first + year + month + restName;
		
		System.out.println("암호 : " + password);
		
	}

}
