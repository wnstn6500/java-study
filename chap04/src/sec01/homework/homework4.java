package sec01.homework;

import java.util.Scanner;

public class homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 헬스 마니아 철수 ===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		int healthNum = sc.nextInt();
		
		if(healthNum == 1) {
			System.out.println("스쿼트 운동 시간입니다.");
		} else if(healthNum == 2) {
			System.out.println("데드리프트 운동 시간입니다.");
		} else if(healthNum == 3) {
			System.out.println("벤치 프레스 운동 시간입니다.");
		} else if(healthNum == 4) {
			System.out.println("풀업 운동 시간입니다.");
		} else if(healthNum == 5) {
			System.out.println("오늘도 수고하셨습니다.");
		} else if(healthNum == 0 || healthNum < 0) {
			System.out.println("양수만 입력해주세요.");
		} else {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		}
	}
}
