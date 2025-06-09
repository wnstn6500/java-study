package com.gn.homework02.controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.gn.homework02.model.vo.Lottery;

public class LotteryController {
	
	Set<Lottery> lottery = new HashSet<Lottery>();
	
	Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		HashSet<Lottery> lottry = new HashSet<Lottery>();
		
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		
		boolean result = lottery.remove(l);
		
		if(result && win != null) {
			win.remove(l);
		}
		
		return result;
	}
	
	public Set<Lottery> searchObject() {
		return lottery;
	}
	
	public Set<Lottery> winObject(){
		if(lottery.size() < 4) {
			return null;
		}
		
		Set<Lottery> validLottery = new HashSet<>(lottery);
		
		win.retainAll(validLottery);
		
		int need = 4 - win.size();
		if (need > 0) {
			List<Lottery> candidates = new ArrayList<>(validLottery);
			candidates.removeAll(win);
			Collections.shuffle(candidates);
			
			for (int i = 0; i < need && i < candidates.size(); i++) {
				win.add(candidates.get(i));
			}
		}
		return win;
		
		
		
		
	}
	
//	public Set<Lottery> sortedWinObject(){
//		
//		
//	}
	
//	public boolean searchWinner(Lottery l) {
//		
//		
//		
//	}
	
}
