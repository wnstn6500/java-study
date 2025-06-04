package com.gn.homework03;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {
	
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== (주)가남에 오신것을 환영합니다. =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1: 
				joinMember();
				break;
			case 2:
				login();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			} 
		}
	}

	public void memberMenu() {
		while(true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("회원 메뉴는 회원만 접근할 수 있습니다.");
			System.out.println("먼저 회원가입, 로그인을 해주세요.");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1: changePassword();
			break;
			
			case 2: changeName();
			break;
			
			case 3: System.out.println("로그아웃 되었습니다.");
			return;
			
			}
		}
	}
	
	public void joinMember() {
		
		
		while(true) {
		System.out.println("=== 1. 회원가입 ===");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		
		Member m = new Member(password,name);
	
		
		if (mc.joinMember(id, m)) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
			break;
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		}
	}
	public void login() {
		
		while(true) {
		System.out.println("=== 2. 로그인 ===");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		String name = mc.logIn(id, password);
		
		
		
		if(name != null) {
			System.out.println(name+"님, 환영합니다!");
			return;
		} else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			
		}
	}
}
	
	public void changePassword() {
		while(true){
		System.out.println("=== 1. 비밀번호 바꾸기 ===");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("현재 비밀번호 : ");
		String oldPw = sc.nextLine();
		System.out.print("새로운 비밀번호 : ");
		String newPw = sc.nextLine();
		boolean result = mc.changePassword(id, oldPw, newPw);
		if(result) {
			System.out.println("비밀번호 변경에 성공했습니다.");
			break;
		} System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
		}
	}
	
	public void changeName() {
		while(true){
			System.out.println("=== 2. 이름 바꾸기 ===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			String name = mc.logIn(id, pw);
			if (name != null) {
				System.out.println("현재 설정된 이름 :" + mc.logIn(id, pw));
				System.out.print("변경할 이름 : ");
				String newName = sc.nextLine();
				mc.changeName(id, newName);
				break;
			} System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");

	}
}
	public void sameName() {
		System.out.println("=== 3. 같은 이름 회원 찾기 ===");
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		TreeMap<String, String> resultMap = mc.sameName(name);
		
		if (resultMap.isEmpty()) {
			System.out.println("해당 이름의 회원이 존재하지 않습니다.");
		} else {
			System.out.println("검색 결과:");
			for (Map.Entry<String, String> entry : resultMap.entrySet()) {
				System.out.println(entry.getValue() + "-" + entry.getKey());
			}
		}
	}
}
