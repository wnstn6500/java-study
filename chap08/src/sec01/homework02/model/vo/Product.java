package sec01.homework02.model.vo;

public class Product {
	private String name; // 상품명 
	private int price; // 가격
	
	Product(){
		
	}
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int calculatePrice() {
		return (int)(price * 0.9);
	}
}
