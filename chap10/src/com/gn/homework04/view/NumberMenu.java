package com.gn.homework04.view;

import java.util.Scanner;

import com.gn.homework04.controller.NumberController;

public class NumberMenu {
	
	boolean result = true;

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		NumberController numberController = new NumberController();
		try {
		
		
			
		result = numberController.checkDouble(num1, num2);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return;
		}
		System.out.print(num1+"은(는) " + num2 +"의 배수인가? " + result);
	}
}
