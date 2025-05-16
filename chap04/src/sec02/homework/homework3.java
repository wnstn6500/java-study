package sec02.homework;


import java.util.Scanner;

public class homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = sc.nextLine();
		
		while(!str.equals("탈출")) {
			System.out.println(str);
			System.out.println("입력 : ");
			str = sc.nextLine();
		} System.out.println("프로그램 종료");
		
	}
}
