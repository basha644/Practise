package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	static String path ="D:\\JAVA\\Teluskoo";
	
	public static void main(String[] args) {
		try {
		File f = new File(path);
		f.mkdirs();
			f.createNewFile(T.txt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
