package com.gn.homework02.view;

import java.util.Scanner;

import com.gn.homework02.controller.LotteryController;
import com.gn.homework02.model.vo.Lottery;

public class LotteryMenu {

	Scanner sc = new Scanner(System.in);
	
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 목록 조회");
			System.out.println("4. 당첨 대상 구성");
			System.out.println("5. 정렬된 당첨 대상 확인");
			System.out.println("6. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1: {
				insertObject();
				
			}
			
			
			case 9: {
				System.out.println("프로그램 종료");
				break;
			}
			}
			
		}
	}
	
	public void insertObject() {
		int count = 0;
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수 :");
		int AddLottery = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < AddLottery; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("휴대폰 번호(-빼고) : ");
			String callNum = sc.nextLine();
			
			Lottery lt = new Lottery(name,callNum);
			
			boolean result = lc.insertObject(lt);
			
			if(result) {
				count++;
			} else {
				System.out.println("중복된 대상입니다. 다시 입력해주세요");
				i--;
			}
			
			
			
		}
		System.out.println(count+ "명 추가 완료했습니다.");
	}
	
	public void deleteObject() {
		
	}
	
	public void searchObject() {
		
		
	}
	
	public void winObject() {
		
		
	}
	
	public void sortedWinObject() {
		
		
	}
	
	public void searchWinner() {
		
		
	}
}
