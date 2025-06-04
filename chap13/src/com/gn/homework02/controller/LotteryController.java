package com.gn.homework02.controller;

import java.util.HashSet;
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
		return true;
	}
}
