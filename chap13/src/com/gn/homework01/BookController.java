package com.gn.homework01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {

	List<Book> list = new ArrayList<Book>();
	
	public BookController() {
		list.add(new Book("느리게 나이드는 습관","정희원","인문",16200));
		list.add(new Book("코스모스","칼 세이건","자연과학",17910));
		list.add(new Book("나에게 들려주는 예쁜 말","김종원","어린이",15610));
		list.add(new Book("혼자 공부하는 자바","신용권","기타",25240));
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public List<Book> selectList(){
		return list;
	}
	
	public List<Book> searchBook(String keyword){
		List<Book> searchList = new ArrayList<Book>();
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).getTitle().contains(keyword)) {
				
				searchList.add(list.get(i));
	
			}
		}
		
		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		for (Book book : list) {
			if(book.getTitle().equals(title) && book.getAuthor().equals(author)) {
				list.remove(book); // 리스트에서 제거
				return book;
			}
		}
		return null;
	}
	
	public int ascBook() {
		Collections.sort(list);
		return 1;
		
	}
}
