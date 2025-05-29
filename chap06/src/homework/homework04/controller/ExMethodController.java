package homework.homework04.controller;

import java.util.Iterator;
import java.util.Scanner;

public class ExMethodController {

	
	public void returnMessage(String x) {
		System.out.println(x);
		
	}
	
	public void addSum() {
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void numCheck(int a) {
		if (a % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	
	public void StringCheck(String x) {
		if(x.matches(".*[a-zA-Z].*")) {
			System.out.println("영문자가 포함되어 있습니다.");
		} else {
			System.out.println("영문자가 포함되어 있지 않습니다.");
		}
	}
	
	public void charCheck(String a, char b) {
		int count = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == b) {
				count++;
			}
		}
		System.out.println(a+ " 문자열에 "+b+" 문자가 " +count+"개 있습니다.");
	}
	
	public void multiplication(int a) {
		
		for (int i = 1; i < 10; i++) {
			int num = i*a;
			System.out.println(a+" x "+i+" = "+num);
			
		}
		
	}
	
	
}
