package homework;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요 : ");
		char a = sc.nextLine().charAt(0);
		int unicode = a;
		System.out.println(a + "의 유니코드: "+ unicode);
	}
}
