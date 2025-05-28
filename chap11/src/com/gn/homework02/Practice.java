package com.gn.homework02;

public class Practice {
	
	public String takeState(String s) {
		
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			if(str[i].endsWith("구")) {
				return str[i];
			}
		}
		
		
		return ""; // 해당 조건 없을경우 빈 문자열 반환
		
	}

}
