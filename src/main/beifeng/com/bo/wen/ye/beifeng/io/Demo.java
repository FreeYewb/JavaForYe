package com.bo.wen.ye.beifeng.io;

import java.io.File;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        // File.separator 可使我们得到系统的文件分隔符
        // System.getProperty("");// 可使我们得到系统的文件分隔符
        File file = new File("src/main/java/com/bo/wen/ye/beifeng/io/demo.java");
        

        if(file.isFile()) {
            System.out.println(file + "sa");
            showFileInfomaTion(file);
            createNewFile("newfile.txt");// 新建新的文件
            deleteFile("newfile.txt");
        }
        // file.p
    }

    private static void deleteFile(String string) {
        File file = new File(string);
        if (!file.exists()) {
            System.out.println("文件存在");
        }
        else {
            System.out.println("文件不存在");
        }

        if (file.delete()) {
            System.out.println("文件被删除了");
        }
        else {
            System.out.println("无法删除文件");
        }
    }

    private static void createNewFile(String string) throws IOException {
        File file = new File(string);
        if (!file.exists()) {
            if (file.createNewFile()) {
            System.out.println("文件创建成功");
            }
            else {
                System.out.println("文件创建失败");
            }
        }
        else {
            System.out.println("文件已经存在");
        }
        //
        //
        //
        // System.out.println("文件已经存在");
        //

    }

    private static void showFileInfomaTion(File file) {
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
    }
}
