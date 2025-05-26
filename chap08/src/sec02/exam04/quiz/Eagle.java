package sec02.exam04.quiz;

public class Eagle extends Animal implements Flyable{

	Eagle(){
		super("독수리",2);

	}
	
	@Override
	void sound() {
		
		System.out.println("모른다.");
	}
	
	@Override
	void eat() {
		
		
		System.out.println("동물을 잡아 먹는다");
	}
	@Override
	public void fly() {
		System.out.println("독수리는 날아 다닌다.");
	}
	
}
