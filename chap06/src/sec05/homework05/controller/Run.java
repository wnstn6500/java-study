package sec05.homework05.controller;

import sec05.homework05.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.changeName("백준수");
		member.printName();
	}
}
