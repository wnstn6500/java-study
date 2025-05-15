package sec02.homework;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(-) : ");
		String residentNumber = sc.nextLine();
		char sex = residentNumber.charAt(7);
		
		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("입력하신 주민번호는 남성입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("입력하신 주민번호는 여성입니다.");
			break;
		default:
			System.out.println("입력하신 주민번호는 잘못된 값입니다.");
		}
	}
}
