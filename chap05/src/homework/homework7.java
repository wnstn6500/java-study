package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class homework7 {
	public static void main(String[] args) {
		
		String[] report = {"Introduction","Research","Conclusion"};
		
		String[] copyReport = report.clone();
		copyReport[0] = "Team Feedback";
		
		System.out.println("원본 보고서: " + Arrays.toString(report));
		System.out.print("복사된 보고서: " + Arrays.toString(copyReport));
			
		}
	}
	
	

