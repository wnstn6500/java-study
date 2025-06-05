package com.gn.homework02.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
			sc.nextLine();
			switch (menuNum) {
			case 1: 
				insertObject();
				break;
			
			case 2: 
				deleteObject();
				break;
			case 3:
				searchObject();
				break;
			case 4:
				winObject();
				break;
			case 5:
				searchObject();
				break;
			case 6:
				searchObject();
				break;	

				
				
			case 9: {
				System.out.println("프로그램 종료");
				return;
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
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String number = sc.nextLine();
		
		Lottery lt = new Lottery(name, number);
		boolean result = lc.deleteObject(lt);
		if(result == true) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void searchObject() {
		System.out.println(lc.searchObject());
		
	}
	
	public void winObject() {
		
		System.out.println("===== 4. 당첨 대상 구성 =====");
		if(lc.winObject() == null) {
			System.out.println("추첨 대상이 4명 이상이어야 당첨 대상을 구성할 수 있습니다.");
		} else {
			
			System.out.println(lc.winObject());
		}
		
		
	}
	
	public void sortedWinObject() {
		
		
	}
	
	public void searchWinner() {
		
		
	}
}
