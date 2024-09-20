package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		try {
		File f = new File("D:\\JAVA\\Telusko\\Test.txt");
			f.createNewFile();
			f.mkdir();
			System.out.println(f.isDirectory());
			System.out.println(f.isFile());
//			f.delete();
			System.out.println("exists:"+f.exists());
			System.out.println(f.getName());
			System.out.println(f.getParent());
			System.out.println(f.getParentFile());
			String s[] = f.list();
			

			System.out.println(f.toURL());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
