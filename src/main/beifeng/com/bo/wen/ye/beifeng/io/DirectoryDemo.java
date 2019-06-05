package com.bo.wen.ye.beifeng.io;

import java.io.File;

public class DirectoryDemo {
    public static void main(String[] args) {
        // File dir = new File("src/main/java/com/bo/wen/ye/beifeng/io");
        // if (dir.isDirectory()) {
        // System.out.println(dir);
        // }
        // for (String s : dir.list()) {
        // System.out.println(s);
        // }
        createSingleDir("src/main/java/com/bo/wen/ye/test1");
        deleteSingleDir("src/main/java/com/bo/wen/ye//test1");

        createMultiDir("test2/dir");
        deleteMultiDir("test2");

        createFileWithDir("test3/a.txt");
        deleteMultiDir("test3");
    }

    private static void createSingleDir(String string) {
        File dir = new File(string);
        if (dir.exists())
            return;

        if (dir.mkdir())
            System.out.println("mlcjcg");

        else
            System.out.println("mlcjsb");

    }

    private static void deleteSingleDir(String string) {
        File dir = new File(string);
        if (!dir.exists())
            return;

        if (dir.delete())
            System.out.println("sccg");

        else
            System.out.println("scsb");

    }
    // 创建目录树
    private static void createMultiDir(String string) {
        File dir = new File(string);
        if (dir.exists())
            return;

        if (dir.mkdirs())
            System.out.println("mlscjcg");

        else
            System.out.println("mlscjsb");
    }
    private static void deleteMultiDir(String string) {
        File dir = new File(string);
        if(!dir.exists()) {
            return;
        }
        if (delete(dir)) {
            System.out.println("sccg");
        }else {
            System.out.println("scsb");
        }
        
    }
    // 递归删除文件或目录
    private static boolean delete(File current) {
        boolean flag = true;
        if (current.isDirectory()) {
            for (File file : current.listFiles()) {
                flag = flag && delete(file);
            }
        }
        return flag && current.delete();
    }

    private static void createFileWithDir(String string) {
        File file = new File(string);
        if (file.exists()) {
            return;
        }
        File dir = file.getParentFile();// 得到当前的父目录
        if (!dir.exists()) {// 目录不存在
            dir.mkdirs();// 目录创建
            try {
                file.createNewFile();// 创建文件
                System.out.println("mlscjcg");
            }
            catch (Exception e) {
                // TODO: handle exception
                System.out.println("mlscjsb");
            }
        }
    }
}
