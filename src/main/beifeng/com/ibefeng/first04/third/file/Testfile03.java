package com.ibefeng.first04.third.file;

import java.io.File;

/**
 * 
 * @ClassName: Testfile03
 * @Description: TODO(递归方式输出文件名)
 * @author yewenbo
 * @date 2019年5月4日 下午6:12:52
 *
 */
public class Testfile03 {
public static void main(String[] args) {
        File file = new File("D:\\javatest");
        new Testfile03().show(file);

    }

    public void show(File file) {

        File[] files = file.listFiles();//
        for (File f : files) {
            System.out.println(f.getName());
            if (f.isDirectory()) {// 判断是不是目录
                show(f);
            }

        }
}
}
