package sec04.quiz;



public class Calculator {
	
	
	int getEvenTotal(int begin,int end){
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			if (i % 2 == 0) {
				sum += i;
				
			}
			
		}
		return sum;
	}
}
