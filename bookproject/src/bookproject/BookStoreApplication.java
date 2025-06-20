package bookproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class BookStoreApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		double avg = 0;
		int count = 0;
		int price = 0;
		
		String isbn = "";
		
		Book book = new Book();
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
//		bookList.add(new Novel("97*8937460449",14000));
//		bookList.add(new Poem("9791193937655",9000));
//		bookList.add(new Novel("97889*7461798",15000));
		
		
//		for (Book book2 : bookList) {
//			book2.printInfo();
//			sum += book2.price;
//		}
//		System.out.println();
//		avg = sum / bookList.size();
//		String formattedNumber = String.format("%.2f", avg);
//		System.out.println("총 평균 가격 : " + formattedNumber +"원");
		
		
		
		while(true) {
		
		System.out.print("책 종류를 입력하세요 (소설/시):");
		String bookType = sc.nextLine();
		
		if(!bookType.equals("소설") && !bookType.equals("시")) {
			System.out.println("잘못된 종류입니다. 다시 입력해주세요.");
			continue;
		}
		
		while(true) {
			
		System.out.print("ISBN을 입력하세요 (13자리, *포함 가능):");
		isbn = sc.nextLine();
		char ch = '*';
		for (int i = 0; i < isbn.length(); i++) {
			if(isbn.charAt(i) == ch) {
				count++;
			}
		}
		
		
		if(isbn.length() != 13 || count > 1){
			System.out.println("다시 입력해주세요");
			count = 0;
			continue;
			}
		if(count == 1) {
			
		}break;
		}
		
		
		
		System.out.print("가격을 입력하세요: ");
		
		try {
			price = sc.nextInt();
			
		} catch (NumberFormatException e) {
			
		}
		sc.nextLine();
		
		if (bookType.equals("소설")) {
			bookList.add(new Novel(isbn,price));
		} else if(bookType.equals("시")) {
			bookList.add(new Poem(isbn,price));
		}
		
		System.out.print("입력을 종료하시겠습니까?(y/Y 입력 시 종료): ");
		String answer = sc.nextLine();
		if(answer.equalsIgnoreCase("n")) {
			continue;
		} break;
		
		
		}
		System.out.println();
		System.out.println("===== 도서 목록 =====");
		for (Book book2 : bookList) {
			book2.printInfo();
			sum += book2.price;
		}
		avg = sum / bookList.size();
		String formattedNumber = String.format("%.2f", avg);
		System.out.println("총 평균 가격 : " + formattedNumber +"원");
		
		
		
	}
	public void isValidISBN(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if(i % 2 == 0) {
				
				result += str.charAt(i);
			} else {
				result += 3*str.charAt(i);
			}
		}
		if(result % 10 == 0) {
			
		}
	}
}
