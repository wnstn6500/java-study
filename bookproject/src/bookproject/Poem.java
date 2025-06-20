package bookproject;

public class Poem extends Book{

	public Poem(String isbn, int price) {
		super(isbn,price);
		
	}
	
	
	@Override
	public void printInfo() {
		
		System.out.println("[시] ISBN: " + isbn + ", 가격: " +price+"원");
		
	}
}
