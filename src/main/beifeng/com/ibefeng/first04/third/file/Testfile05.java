package com.ibefeng.first04.third.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 
 * @ClassName: Testfile05
 * @Description: TODO(匿名内部类)
 * @author yewenbo
 * @date 2019年5月4日 下午7:03:12
 *
 */
public class Testfile05 {
    public static void main(String[] args) {
        new Testfile05().shwo();
    }

    public void shwo() {
        File file = new File("D:\\javatest");
        File[] fs = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                // TODO Auto-generated method stub
                if (name.endsWith(".java")) {
                    return true;
                }
                    return false;
            }
        });
        for (File f : fs) {
            System.out.println(f.getName());
        }
    }
}
