package com.gn.homework02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Practice {

	public long method1(String path) {
		long start = System.nanoTime();
		
		
		try(FileInputStream fis = new FileInputStream(new File(path,"나비야1.dat"))){
			int data;
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		return end - start;
		
}
	
	public long method2(String path) {
		long start = System.nanoTime();
		
		
		try(BufferedInputStream bis = new BufferedInputStream(
			new FileInputStream(new File(path,"나비야1.dat")))){
			int data;
			while((data = bis.read()) != -1) {
				System.out.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		return end - start;
		
}
}