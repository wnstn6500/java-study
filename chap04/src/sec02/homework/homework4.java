package sec02.homework;


import java.util.Scanner;

public class homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이 하시겠습니까?(yes/no)");
			answer = sc.next();
			
		} while(answer.equals("yes"));
		
		 if (answer.equals("no")) {
			 System.out.println("게임을 종료합니다.");
		 }
	}
	
}
