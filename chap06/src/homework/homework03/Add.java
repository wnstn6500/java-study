package homework.homework03;

public class Add {
	
	
	
	String returnString(String x, String y) {
		return x + y;
	}
	
	int returnX(int x, int y) {
		if(x < y) {
			System.out.println("계산할 수 없습니다");
			return 0;
		}
		return x * y;
	}
	boolean isSame(String x,String y) {
		return x.equals(y);
	}
}
