package homework;


import java.util.Arrays;
import java.util.Scanner;

public class homework6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arraylength;
		
		System.out.print("배열의 크기를 입력하세요:");
		String [] array = new String[sc.nextInt()];
		sc.nextLine();
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 문자열 : ");
			array[i] = sc.nextLine(); 
			
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) :");
			String answer = sc.next();
			if("n".equalsIgnoreCase(answer)) {
				
				break;
			}
			System.out.print("더 입력하고 싶은 개수 : ");
			int num = sc.nextInt();
			sc.nextLine();
			arraylength = array.length;
			array = Arrays.copyOf(array, array.length + num);
			for (int i = arraylength; i < array.length; i++) {
				System.out.print(i + 1 + "번째 문자열 : ");
				array[i] = sc.nextLine();
			}
		}
		for(String book:array) {
			System.out.println(book);
		}
		
			
		}
	}
	
	

