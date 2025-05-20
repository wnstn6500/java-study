package homework;

import java.util.Scanner;

public class homework5 {
	public static void main(String[] args) {
		
		String[] choices = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int winCount = 0;
		int loseCount = 0;
		int draw = 0;
		
		System.out.print("가위바위보 : ");
		String user = sc.nextLine();
		
		while(!user.equals("stop")) {
			System.out.print("컴퓨터 : ");
			int random = (int)(Math.random()*3);
			System.out.println(choices[random]);
			System.out.println("사용자 : " + user);
			
			if (user.equals(choices[random])) {
				System.out.println("비겼습니다.");
				count++;
				draw++;
				System.out.print("가위바위보 : ");
				user = sc.nextLine();
				
			} else if (user.equals("가위") && choices[random].equals("보")) {
				System.out.println("이겼습니다 !");
				count++;
				winCount++;
				System.out.print("가위바위보 : ");
				user = sc.nextLine();
			} else if (user.equals("바위") && choices[random].equals("가위")) {
				System.out.println("이겼습니다 !");
				count++;
				winCount++;
				System.out.print("가위바위보 : ");
				user = sc.nextLine();
			} else if (user.equals("보") && choices[random].equals("바위")) {
				System.out.println("이겼습니다 !");
				count++;
				winCount++;
				System.out.print("가위바위보 : ");
				user = sc.nextLine();
			} else if (user.equals("가위") && choices[random].equals("바위")) {
				System.out.println("졌습니다ㅠㅠ");
				count++;
				loseCount++;
				System.out.print("가위바위보 : ");
				user = sc.nextLine();
			}else if (user.equals("바위") && choices[random].equals("보")) {
				System.out.println("졌습니다ㅠㅠ");
				count++;
				loseCount++;
				System.out.print("가위바위보 : ");
				user = sc.nextLine();
			}else if (user.equals("보") && choices[random].equals("가위")) {
				System.out.println("졌습니다ㅠㅠ");
				count++;
				loseCount++;
				System.out.print("가위바위보 : ");
				user = sc.nextLine();
			}
		}
		if(user.equals("stop")) {
			System.out.println(count+"전 "+winCount+"승 "+draw+"무 "+loseCount+"패");
		}
	}
}
