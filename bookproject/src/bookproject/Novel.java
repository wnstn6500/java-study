package bookproject;

public class Novel extends Book{
	
	public Novel(String isbn, int price) {
		super(isbn,price);
		
	}
	
	@Override
	public void printInfo() {
		
		
		System.out.println("[소설] ISBN: " + isbn + ", 가격: " +price+"원");
		
	}
}
