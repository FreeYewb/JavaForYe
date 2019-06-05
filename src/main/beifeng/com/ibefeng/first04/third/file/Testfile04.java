package com.ibefeng.first04.third.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 
 * @ClassName: Testfile04
 * @Description: TODO(内部类，筛选文件)
 * @author yewenbo
 * @date 2019年5月4日 下午6:56:25
 *
 */
public class Testfile04 {
    public static void main(String[] args) {
        new Testfile04().show();
    }

    // 内部类不能在静态方法使用，先定义实例方法，然后调用内部类
    public void show() {
        File file = new File("D:\\javatest");
        File[] fs = file.listFiles(new MyFile());
        for (File f : fs) {
            System.out.println(f.getName());
        }
    }
    class MyFile implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {
            if (name.endsWith(".java")) {
                return true;
            }
            return false;
        }

    }
}
