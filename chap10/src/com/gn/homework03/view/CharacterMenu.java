package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03.controller.CharacterController;
import com.gn.homework03.exception.CharCheckException;

public class CharacterMenu {
	
	Scanner sc = new Scanner(System.in);
	
	CharacterController characterController = new CharacterController();
	
	int num = 0;
	
	public void menu() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		try {
			num = characterController.countAlpha(str);
			
		} catch (CharCheckException e) {
			e.printStackTrace();
			return;
		}
		System.out.print("'" + str + "'에 포함된 영문자 개수 : " + num);
	}
	
}
