package com.ibefeng.first04.third.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 
 * @ClassName: TestDataInputStream
 * @Description: TODO()
 * @author yewenbo
 * @date 2019年5月17日 下午8:13:35
 *
 */
public class TestDataInputStream {
    public static void main(String[] args) {
        DataInputStream input = null;
        try {
            input = new DataInputStream(new FileInputStream("D:\\javatest\\testdataout.bin"));
        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
