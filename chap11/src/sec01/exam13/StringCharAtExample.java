package sec01.exam13;

public class StringCharAtExample {

	public static void main(String[] args) {
		// 주민등록번호에서 남자와 여자를 구분하는 방법
		String ssn = "010624-1230123";
		
		char gender = ssn.charAt(7); // 문자열에서 특정 인덱스의 문자 추출
		
		if (gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		} else if(gender == '2' || gender == '4'){
			System.out.println("여자입니다.");
		}
		
		
	}
}
