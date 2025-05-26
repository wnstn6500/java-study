package sec02.exam04.quiz;

public abstract class Animal {

	private String kind;
	private int leg;
	
	Animal(String kind, int leg){
		this.kind = kind;
		this.leg = leg;
	}
	
	
	
	abstract void eat();
	
	abstract void sound();



	public String getKind() {
		return kind;
	}

	public int getLeg() {
		return leg;
	}

}
