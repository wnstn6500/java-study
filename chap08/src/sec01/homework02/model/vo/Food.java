package sec01.homework02.model.vo;

public class Food extends Product{
	private int expirationDays;
	
	public Food(){
		
	}
	
	public Food(String name, int price, int expirationDays){
		super(name,price);
		this.expirationDays = expirationDays;
	}
	
	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscountRate() {
		if(expirationDays <= 1) {
			return 80;
		} else if(expirationDays <= 5) {
			return 50;
		} else if(expirationDays <= 10)  {
			return 20;
		} else {
			return 1;
		}
	}
	
	@Override
	public int calculatePrice() {
		
		return (getPrice() * (calculateDiscountRate()) / 100);
	}
}
