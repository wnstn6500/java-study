package sec01.homework04.run;

import sec01.homework04.model.vo.Car;
import sec01.homework04.model.vo.ElectricEngine;
import sec01.homework04.model.vo.GasolineEngine;


public class Run{
	public static void main(String[] args) {
		
		Car car1 = new Car(new GasolineEngine());
		Car car2 = new Car(new ElectricEngine());
		
		car1.startEngine();
		car2.startEngine();
	}
}
