package homework;

import java.util.Arrays;

public class homework4 {
	public static void main(String[] args) {
		
		int random[]  = new int[6];
		
		
		for (int i = 0; i < 6; i++) {
			random[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j < i; j++) {
				if(random[i]==random[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 1; i < random.length; i++) {
			for(int j = 0; j < i; j++) {
				if(random[i] < random[j]) {
					
					int temp;
					temp = random[i];
					random[i] = random[j];
					random[j] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(random));
		
	}
	
	
}
