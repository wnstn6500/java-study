package sec02.exam07;

import java.util.Scanner;


public class WhileSum1To100Example {
	public static void main(String[] args) {
		// 1부터 10까지 반복해서 출력
		
		int i = 1;
		int total = 0; // 초기화식
		
		while(i <= 100) { // 조건식
			total += i;
			i++; // 증감식, 이게 빠지면 무한 루프에 빠짐
		}
		
		System.out.println("1~" + (i - 1) + " 합: " + total);
		
		// (참고) 무한 루프
		while (true) {
			System.out.println("무한 반복");
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (true) {
				break;
			}
		}
		
		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복");
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (true) {
				flag = false;
			}
		}
		
		// 1부터 100까지 합
		// do-while문으로 작성
		int sum = 0;
		i = 1;
		
		do { // 처음 한번은 무조건 실행
			sum += i;
			i++;
		} while(i <= 100); // 세미콜론 필수!
		
		System.out.println("1~" + (i - 1) + " 합: " + sum);
		
		// Quiz: 1부터 100까지 홀수의 합
		
		int num = 0;
		i = 1;
		while(i <= 100) {
			if(i % 2 == 1) {
				num += i;
			}
			i++;
		}
		System.out.println("1부터 100까지 홀수의 합 "+ num);
		
		// Quiz2
//		화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
//		
//		[입력]   [출력]
//		123   =>  6
//		12345 =>  15
		
		// 힌트 : 1) 마지막 자리 수 더하기 , 2) 마지막 자리 제거
		
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수를 입력하세요: ");
		int number = sc.nextInt();
		
		sum = 0;
		
		while(number > 0) {
			sum += number % 10; // 마지막 자리 수 더하기
			number /= 10; // 마지막 자리 제거
		}
		
		System.out.println("각 자리수의 합: " + sum);
		
		System.out.println();
		
		// 이름 붙은 반복문
		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'A'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter; // Label(레이블)이 지정된 for문을 빠져나감
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
	
	
	
}
