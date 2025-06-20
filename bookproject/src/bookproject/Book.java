package bookproject;

	public class Book {
		
	public String isbn;
	public int price;

	public Book() {
		
	}

	public Book(String isbn, int price) {
		this.isbn = isbn;
		this.price = price;
	}

	public void printInfo() {
		System.out.println("ISBN : " + isbn +", 가격 : " +price+"원");

	}
	
	public void recoverMissingDigit() {
		
		
	}
	
	

}