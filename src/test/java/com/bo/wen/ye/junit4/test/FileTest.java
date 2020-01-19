package com.bo.wen.ye.junit4.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("E:\\BCCSWJ\\file\\qwe3.txt");
		File file1 = new File("E:\\BCCSWJ\\file\\qwe4.txt");
		file.mkdir();
//		file.mkdirs();
//		System.out.println(file.mkdir());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
