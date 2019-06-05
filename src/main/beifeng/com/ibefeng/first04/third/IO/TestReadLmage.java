package com.ibefeng.first04.third.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 
 * @ClassName: TestReadLmage
 * @Description: TODO(读取图片，打印图片，数组大小不够的话，图片会打印一半)
 * @author yewenbo
 * @date 2019年5月17日 下午8:12:51
 *
 */
public class TestReadLmage {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("D:\\javatest\\4.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\javatest\\3.jpg"));
            int len = 0;
            byte[] bfs = new byte[1024];
            while ((len = bis.read(bfs)) > 0) {
                bos.write(bfs, 0, len);
            }
            bos.flush();
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
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
