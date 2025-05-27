package sec01.homework04.model.vo;

public class Car{
	
	private Engine engine;
	
	public Car(Engine engine){
		this.engine = engine;
	}
	
	public void startEngine() {
		engine.start();
	}
	
}
