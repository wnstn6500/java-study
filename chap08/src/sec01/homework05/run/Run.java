package sec01.homework05.run;

import sec01.homework05.model.vo.GalaxyS24;
import sec01.homework05.model.vo.Iphone15;
import sec01.homework05.model.vo.SmartPhone;

public class Run {

	public static void main(String[] args) {
		SmartPhone [] smartPhone = new SmartPhone[2];

		smartPhone[0] = new GalaxyS24();
		smartPhone[1] = new Iphone15();
		
		for (int i = 0; i < smartPhone.length; i++) {
			if(i == 0) {
				smartPhone[0].printMaker();
				smartPhone[0].makeCall();		
				smartPhone[0].takeCall();		
				smartPhone[0].touch();		
				smartPhone[0].charge();		
				smartPhone[0].picture();
				System.out.println();
			} else {
				smartPhone[1].printMaker();
				smartPhone[1].makeCall();		
				smartPhone[1].takeCall();		
				smartPhone[1].touch();		
				smartPhone[1].charge();		
				smartPhone[1].picture();
			}
		}
	}

}
