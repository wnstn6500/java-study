package com.gn.homework06;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		String [] sen = sentence.split(" ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요:");
		String a = sc.nextLine();
		
		if (sentence.contains(a)) {
			for (int i = 0; i < sen.length; i++) {
				if (sen[i].equals(a)) {
					if(sen[sen.length-1].equals(a)) {
						System.out.println("마지막 단어입니다.");
						break;
					}
					System.out.println(a +" 다음 단어: "+sen[i+1]);
				} 
			} 
		} else { 
			System.out.println("존재하지 않는 단어입니다");
		}
	
	}
}