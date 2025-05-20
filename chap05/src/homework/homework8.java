package homework;

import java.util.Arrays;

public class homework8 {
	public static void main(String[] args) {
		
		String[] menu = {"Burger", "Pizza", "Pasta"};
		
		String[] add = {"Salad","Soup"};
		
//		String[] newMenu = Arrays.copyOf(menu, menu.length + 2);
//		newMenu[3] = add[0];
//		newMenu[4] = add[1];
		
		String[] newMenu = Arrays.copyOf(menu, menu.length + add.length);
		System.arraycopy(add, 0, newMenu, menu.length, add.length);
		
		System.out.println("어제 메뉴판:" + Arrays.toString(menu));
		System.out.println("오늘 메뉴판:" + Arrays.toString(newMenu));
		}
	
	}
	
	

