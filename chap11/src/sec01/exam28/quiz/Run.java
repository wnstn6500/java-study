package sec01.exam28.quiz;

import java.util.Scanner;

public class Run {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반 전체 학생이 몇 명인지 입력하세요 : ");
		String [] classNum = new String[sc.nextInt()];
		sc.nextLine();
		
		
		for (int i = 0; i < classNum.length; i++) {
			System.out.print(i+1+"번쨰 학생의 이름을 입력하세요 : ");
			classNum[i] = sc.nextLine();
		}
		
		int ran = (int)(Math.random() * classNum.length);
		
		String byCoffee = classNum[ran];
		
		System.out.println("커피를 살 사람은 "+ byCoffee +"입니다.");
		
	}
}
