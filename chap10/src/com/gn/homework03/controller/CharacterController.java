package com.gn.homework03.controller;

import com.gn.homework03.exception.CharCheckException;

public class CharacterController {
	
	public int count = 0;
	
	public CharacterController() {
		
	}
	char ret1 = ' ';
	int ret = ret1;

	public int countAlpha(String s) throws CharCheckException{
		for (int i = 0; i < s.length(); i++) {
			if(('A' <= s.charAt(i)) && (s.charAt(i) <= 'Z') || ('a' <= s.charAt(i))
					&& (s.charAt(i) <= 'z')) {
				count++;
			} else if(' ' == s.charAt(i)) {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
		}
		return count;
	}
}
