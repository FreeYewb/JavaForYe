package com.ibefeng.first04.third.IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @ClassName: TestDataOutputStream
 * @Description: TODO(输入流，控制输入的字节)
 * @author yewenbo
 * @date 2019年5月17日 下午8:18:31
 *
 */
public class TestDataOutputStream {
    public static void main(String[] args) {
        DataOutputStream dos = null;

        try {
            dos = new DataOutputStream(new FileOutputStream("D:\\javatest\\testdataout.bin"));
            dos.writeInt(12);
            dos.writeInt(24);
            dos.flush();
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
