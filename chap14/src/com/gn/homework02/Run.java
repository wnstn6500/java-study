package com.gn.homework02;

public class Run {
	public static void main(String[] args) {
		String filePath = "C:\\test\\sub"; // 폴더 경로
		Practice practice = new Practice();
		
		System.out.println("===== method1 (FileInputStream) 실행시간 =====");
		long time1 = practice.method1(filePath);
		System.out.println("\n 소요 시간: " + time1 + "ns");
		
		System.out.println("===== method2 (BufferedInputStream) 실행시간 =====");
		long time2 = practice.method2(filePath);
		System.out.println("\n 소요 시간:" + time2 + "ns");
		
		System.out.println("\n===== 결과 비교 =====");
		if (time1 < time2) {
			System.out.println("method1(FileInputStream)이 더 빠릅니다");
		} else if(time1 > time2){
			System.out.println("method2(BufferedInputStream)이 더 빠릅니다");
		} else {
			System.out.println("두 메서드의 실행시간이 동일합니다.");
		}
	
	}

}
