package sec05.homework05.model.vo;

public class Member {

	String memberld;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	
	public void changeName(String memberName){
		this.memberName = memberName;
	}
	
	public void printName() {
		System.out.println(memberName);
	}
}
