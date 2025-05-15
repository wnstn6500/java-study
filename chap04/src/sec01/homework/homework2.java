package sec01.homework;

import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String season;
		
		System.out.println("=== 일기예보 ===");
		System.out.print("월 :");
		int month = sc.nextInt();
		if (month < 1 || month > 12) {
		System.out.println("해당하는 계절은 없습니다.");
		}
		System.out.print("기온 :");
		int temperature = sc.nextInt();
		
		if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if(month == 6 || month == 7 || month == 8) {
			season = "여름";
			if(temperature >= 35) {
				System.out.println(season + "폭염 경보");
			}
			if(temperature >= 33 && temperature < 35) {
				System.out.println(season + "폭염 주의보");
			}
		} else if(month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else if(month == 12 || month == 1 || month == 2) {
			season = "겨울";
			if(temperature <= -15) {
				System.out.println(season + " 한파 경보");
			}
			if(temperature <= -12 && temperature > -15) {
				System.out.println(season + " 한파 주의보");
			}
		}
	}
}
