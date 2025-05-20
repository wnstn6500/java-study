package homework;


import java.util.Arrays;

public class homework1 {
	public static void main(String[] args) {
		
		int [] height = {152, 180, 165, 158, 151};
		
		
		for(int i = 1; i < height.length; i++) {
			for(int j = 0; j < i; j++) {
				if(height[i] < height[j]) {
					
					int temp;
					temp = height[i];
					height[i] = height[j];
					height[j] = temp;
				}
			}
			
		}
		System.out.println("정렬 완료 : " + Arrays.toString(height));
		
		
		
//		Arrays.sort(height);
//		
//		System.out.println(Arrays.toString(height));
	}
	
	
}
