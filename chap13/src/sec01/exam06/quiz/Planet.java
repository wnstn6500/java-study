package sec01.exam06.quiz;

public class Planet {

	private String name;
	private int diameter;
	private double period;
	
	Planet(){
		
	}
	
	Planet(String name, int diameter, double period){
		this.name = name;
		this.diameter = diameter;
		this.period = period;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDiameter() {
		return diameter;
	}
	
	public double getPeriod() {
		return period;
	}
	
	@Override
	public String toString() {
		
		return "행성 이름: " +name+"지름: " +diameter+"km, 공전주기:" + period+"년";
		
	}
}
