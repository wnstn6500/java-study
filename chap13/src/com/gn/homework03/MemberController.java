package com.gn.homework03;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MemberController {

	Map<String,Member> map = new HashMap<String,Member>();
	Member m = new Member();
	
	
	public boolean joinMember(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	public String logIn(String id, String password) {
		
		if(map.containsKey(id)) {
			
			m = map.get(id);
			
			if(m.getPassword().equals(password)) {
				
				return m.getName();
				
			}
		}
		
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)) {
			m = map.get(id);
			if (m.getPassword().equals(oldPw)) {
				m.setPassword(newPw);
				return true;
			}
		} return false;
		
		
	}
	
	public void changeName(String id, String newName) {
		m = map.get(id);
		m.setName(newName);
		System.out.println("이름 변경에 성공했습니다.");
	}
	
	public TreeMap<String,String> sameName(String name){
		TreeMap<String, String> resultMap = new TreeMap<>();
		
		for (String id : map.keySet()) {
			Member member = map.get(id);
			if (member.getName().equals(name)) {
				resultMap.put(id, member.getName());
			}
		}
		return resultMap;
	}
}
