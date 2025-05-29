package homework.homework04.run;

import homework.homework04.controller.ExMethodController;

public class Run {
		public static void main(String[] args) {
			
			ExMethodController ex = new ExMethodController();
			
			ex.returnMessage("ㅎㅎ");
			
			ex.addSum();
			
			ex.numCheck(3);
			
			ex.StringCheck("ㅎㅎ");
			
			ex.charCheck("다다다다다다", '다');
			
			ex.multiplication(3);
		}
	
	
}
