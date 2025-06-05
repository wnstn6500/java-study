package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		// 길이가 100인 char 타입의 빈 배열 생성
		char[] buffer = new char[100];
		
		while(true) {
			// 입력 스트림으로부터 배열의 길이만큼 읽어옴
			int readCharNum = reader.read(buffer);
			if (readCharNum == -1) break;
			
			// 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
			for (int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();
		
		
		
	}
}
