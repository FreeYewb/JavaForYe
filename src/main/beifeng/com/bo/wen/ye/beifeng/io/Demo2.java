package com.bo.wen.ye.beifeng.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

/**
 * 文件名的过滤
 * 
 * @author Administrator
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的目录：");
        String path = scanner.nextLine();
        System.out.println("请输入你要查找的文件的后缀：");
        final String suffix = scanner.nextLine();
        File file = new File(path);
        String[] files = file.list(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                // TODO Auto-generated method stub
                if (name.endsWith(suffix)) {// 文件名名称以suffix表示这文件是我想要的
                    return true;
                }
                return false;
            }
        });
        for (String s : files) {
            System.out.println(s);
        }

    }
}
