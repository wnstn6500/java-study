package homework.homework03;

public class AddExample {
	public static void main(String[] args) {
		
		Add myAdd = new Add();
		
		System.out.println(myAdd.returnString("안녕","하세요"));
		
		System.out.println(myAdd.returnX(4, 4));
		
		System.out.println(myAdd.isSame("하", "하이"));
	}
}
