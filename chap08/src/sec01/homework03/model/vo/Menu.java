package sec01.homework03.model.vo;

public abstract class Menu {
	private String name;
	private int price;
	
	protected Menu(){
		
	}
	
	protected Menu(String name,int price){
		
	}
	
	public String toString(String name, int price) {
		return "메뉴명은 "+ name +"이고, 가격은"+ price +"원입니다.";
	}
	
	public abstract void cook();
}
