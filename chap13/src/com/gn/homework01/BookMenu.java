package com.gn.homework01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	
	BookController bc = new BookController();
	
	public void mainMenu() {
		while(true) {
			System.out.print("=== 가남 도서관에 오신걸 환영합니다 ===\r\n"
					+ "원하시는 업무의 번호를 선택하세요.\r\n"
					+ "1. 새 도서 추가\r\n"
					+ "2. 도서 전체 조회\r\n"
					+ "3. 도서 검색 조회\r\n"
					+ "4. 도서 삭제\r\n"
					+ "5. 도서 오름차순 정렬\r\n"
					+ "9. 종료\r\n"
					+ "메뉴 선택 :");
			int menuNum = sc.nextInt();
			sc.nextLine();
			if(menuNum == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(menuNum != 1 && menuNum != 2 && menuNum != 3 && menuNum != 4 &&
					menuNum != 5 && menuNum != 9) {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			} else if (menuNum == 1) {
				insertBook();
			} else if(menuNum == 2) {
				selectList();
			} else if(menuNum == 3) {
				searchBook();
			} else if(menuNum == 4) {
				deleteBook();
			} else if (menuNum == 5) {
				ascBook();
			}
		}
		
	}
	
	public void insertBook() {
		System.out.println("=== 도서 등록 ===");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르 : ");
		int categoryNum = sc.nextInt();
		String category = "";
		if(categoryNum == 1) {
			category = "인문";
		} else if(categoryNum == 2) {
			category = "자연과학";
		} else if(categoryNum == 3) {
			category = "어린이";
		} else {
			category = "기타";
		}
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		Book bk = new Book(title,author,category,price);
		
		bc.insertBook(bk);
		
	}
	
	public void selectList() {
		System.out.println("=== 전체 조회 ===");
		
		bc.selectList();
		
		List <Book>bookList = new ArrayList<Book>();
		
		bookList = bc.selectList();
		
		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
		
	}
	
	public void searchBook() {
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		
		List <Book> searchList = bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Book book : searchList) {
				System.out.println(book);
			}
		}
	}
	
	public void deleteBook() {
		System.out.println("삭제할 도서명 입력:");
		String title = sc.next();
		
		System.out.println("삭제할 저자명 입력:");
		String author = sc.next();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다: " + remove);
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}
	
	public void ascBook() {
		if (1 == bc.ascBook()) {
			System.out.println("정렬에 성공하였습니다.");
			selectList();
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
