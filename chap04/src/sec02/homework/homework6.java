package sec02.homework;

import java.util.Scanner;

public class homework6 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j >= 5 - i && j <= 5 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
