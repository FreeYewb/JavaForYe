package com.ibefeng.first04.third.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutStream {
    public static void main(String[] args) {
        FileInputStream input = null;
        FileOutputStream out = null;
        try {
            input = new FileInputStream("D:\\javatest\\java.txt");
            out = new FileOutputStream("D:\\javatest\\outjava1.txt");
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = input.read(b)) > 0) {
                out.write(b, 0, len);
            }
        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {

            try {
                if (input != null) {
                    input.close();
                }
                if (out != null) {
                    out.close();
                }
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
