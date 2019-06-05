package com.ibefeng.first04.third.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * 
 * @ClassName: TestInputStreamReader
 * @Description: TODO(输入流文件，汉化简化版)
 * @author yewenbo
 * @date 2019年5月10日 下午4:10:32
 *
 */
public class TestInputStreamReader {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(new FileInputStream("E:\\jmeter test\\改数实施文件.txt"), "GB2312"));
            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

        }
        catch (UnsupportedEncodingException | FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
