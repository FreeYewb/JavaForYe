package com.ibefeng.first04.third.file;

import java.io.File;

/**
 * 
 * @ClassName: Testfile02
 * @Description: TODO(输出文件名)
 * @author yewenbo
 * @date 2019年5月4日 下午6:12:48
 *
 */
public class Testfile02 {
    public static void main(String[] args) {
        File file = new File("D:\\javatest");
        String[] files = file.list();
        for (String f : files) {
            System.out.println(f);
        }
    }
}
