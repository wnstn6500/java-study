package com.gn.homework01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Practice {

	
	// method1: FileOutputStream만 사용
	public void method1(String lyrics) {
		
		try (FileOutputStream fos = new FileOutputStream("C:\\test\\sub\\나비야1.dat")){
				fos.write(lyrics.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	// method2: BufferedOutputStream과 함께 사용
	public void method2(String lyrics) {
		
		try (BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("C:\\test\\sub\\나비야2.dat"))){
			bos.write(lyrics.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
