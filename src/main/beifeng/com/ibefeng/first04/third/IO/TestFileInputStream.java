package com.ibefeng.first04.third.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @ClassName: TestFileInputStream
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年5月4日 下午11:45:45
 *
 */
public class TestFileInputStream {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileInputStream file = null;
        try {
            // 创建FileInputStream对象
            file = new FileInputStream("D:\\javatest\\java.txt");
            // 定义字节数组接收读取的数据
            byte[] b = new byte[1024];
            // 定义len接收每次读取长度
            int len = 0;
            // 循环读取
            while ((len = file.read(b, 0, len)) > 0) {
                System.out.write(b, 0, len);// 写入控制台
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
                // 释放资源，关闭FileInputStream
                    if (file != null) {file.close();}
                }
                catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();

            }
        }
    }

}
