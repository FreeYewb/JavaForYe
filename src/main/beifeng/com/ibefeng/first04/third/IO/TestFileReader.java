package com.ibefeng.first04.third.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReader {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("D:\\\\javatest\\\\java.txt");
            fw = new FileWriter("D:\\\\javatest\\\\jw.txt");
            fr.read();
            char[] chars = new char[1024];
            int len= 0;
            while((len=fr.read(chars))>0) {
                fw.write(chars, 0, len);
            }
        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.close();
                }
            }
            catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
    }

}
