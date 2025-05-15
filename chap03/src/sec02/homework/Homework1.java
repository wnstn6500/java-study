package sec02.homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요: ");
		String talk = sc.next();
		String answer;
		switch (talk) {
		case "간다": answer = "온다";
		break;
		
		default: answer = "간다";
		
		}
		System.out.println("앵무새 : " + answer);
	}
}
