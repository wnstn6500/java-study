package sec01.homework03.run;

import sec01.homework03.model.vo.Dish;
import sec01.homework03.model.vo.Drink;
import sec01.homework03.model.vo.Menu;

public class Main {
	public static void main(String[] args) {
		
//		System.out.println(ran);
		
		Menu [] menu = new Menu[5];
		
		for (int i = 0; i < menu.length; i++) {
			int ran = (int)(Math.random()*2)+1;
			if(ran == 1) {
				menu[i] = new Drink("콜라",2000,"설탕");
			} else {
				menu[i] = new Dish("케이크",15000,"생크림");
			} menu[i].cook();
		}
	}
}
