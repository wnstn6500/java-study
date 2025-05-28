package sec01.quiz_string;

public class Quiz1 {
	// Quiz
//	입력된 문자열 중 숫자들의 합계를 출력하시오.

//	[입력]
	String str1 = "1,2,3,4,5";
	String str2 = "1-2-3-4-5";
	String str3 = "a1b2c3de45";

//	[출력]
//	1) 15
//	2) 15
//	3) 15
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
//		[입력]
		String str1 = "1,2,3,4,5";
		String str2 = "1-2-3-4-5";
		String str3 = "a1b2c3de45";
		
		String[] str11 = str1.split(",");
		String[] str22 = str1.split("-");
		String[] str33 = str1.split("a,b,c,de");
		
		for (String str : str11) {
			int intValue1 = Integer.parseInt(str);
			num1 += intValue1;
		}
		System.out.println("1)"+num1);
		
		for (String str : str11) {
			int intValue2 = Integer.parseInt(str);
			num2 += intValue2;
		}
		System.out.println("2)"+num2);
		
		for (String str : str11) {
			int intValue3 = Integer.parseInt(str);
			num3 += intValue3;
		}
		System.out.println("3)"+num3);
		
	}

}
