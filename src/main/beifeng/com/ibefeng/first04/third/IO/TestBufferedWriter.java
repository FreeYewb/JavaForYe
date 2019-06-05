package com.ibefeng.first04.third.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @ClassName: TestBufferedWriter
 * @Description: TODO(输入流文件，汉化)
 * @author yewenbo
 * @date 2019年5月10日 下午4:10:39
 *
 */
public class TestBufferedWriter {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            // br = new BufferedReader(new FileReader("E:\\jmeter test\\9866.txt"));
            bw = new BufferedWriter(new FileWriter("D:\\javatest\\testbr.txt"));
            FileInputStream fis = new FileInputStream("E:\\jmeter test\\9866.txt");
            InputStreamReader fr = new InputStreamReader(fis, "GB2312");
            BufferedReader br2 = new BufferedReader(fr);
            String str = null;
            while ((str = br2.readLine()) != null) {
                System.out.println(str);
                bw.write(str, 0, str.length());
                bw.newLine();
            }
            
            

            bw.flush();
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
