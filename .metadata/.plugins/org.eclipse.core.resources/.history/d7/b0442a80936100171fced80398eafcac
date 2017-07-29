package com.java.arraystreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ArrayStreamDemo {

	public static void main(String[] args) throws Throwable {
//		FileOutputStream fos1=new FileOutputStream(new File("e:\\test.txt"));
//		fos1.write(97);
//		fos1.write(98);
//		fos1.write(99);
//		byte []b={97,98,'c'};
//		fos1.write(b,0,1);
//		fos1.close();
		File file=new File("e:\\test.txt");
		FileInputStream in=new FileInputStream(file);
//		int data=in.read();
//		while(data!=-1){
//			System.out.print((char)data);
//			data=in.read();
//		}
		
		byte [] by=new byte[(int) file.length()];
		in.read(by);
		System.out.println(new String(by));
		in.close();
	
			
			

	}

}
