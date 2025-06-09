package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	public void deleteFile(File dir) {
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			if (files != null) {
				for (File file : files) {
					if (file.isFile()) {
						if(file.delete()) {
							System.out.println(file.getPath() + " -> 삭제 완료");
						} else {
							System.out.println(file.getPath() + " -> 삭제 실패");
						}
					} else {
						// 디렉토리는 삭제하지 않음
						System.out.println(file.getPath() + " -> 삭제 안됨");
					}
				}
			}
		} else {
			System.out.println("유효한 디렉토리가 아닙니다.");
		}
	}
}
