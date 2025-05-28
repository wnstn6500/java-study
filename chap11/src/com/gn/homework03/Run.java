package com.gn.homework03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String email = sc.nextLine();
		email.trim();
		String emailUpper = email.toUpperCase();
		
		String[] emailId = emailUpper.split("@");
		
		
		if (!email.endsWith("@goodee.co.kr")) {
			System.out.println("유효하지 않은 이메일입니다.");
		} else {
			System.out.println("아이디 : " + emailId[0]);
		}
		
	}
}
