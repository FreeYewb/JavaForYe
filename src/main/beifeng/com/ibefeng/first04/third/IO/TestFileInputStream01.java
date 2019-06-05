package com.ibefeng.first04.third.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream01 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("D:\\javatest\\java.txt");
            int len = 0;
            byte[] b = new byte[1024];
            while(len != -1) {
                len = file.read(b);
            }
            System.out.write(b);
            // while ((len = file.read(b, 0, len)) > 0) {
            // System.out.write(b, 0, len);
            // }
        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
