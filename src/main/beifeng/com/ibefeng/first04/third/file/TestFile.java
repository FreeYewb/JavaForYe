package com.ibefeng.first04.third.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: TestFile
 * @Description: TODO(file 的使用)
 * @author yewenbo
 * @date 2019年5月4日 下午5:43:33
 *
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("D:\\javatest\\java.txt");
        File file2 = new File("D:\\javatest\\mydir");
        File file3 = new File("D:\\javatest\\mydir\\a\\b\\c");
        try {
            file.createNewFile();//创建文件
            file2.mkdir();// 在存在的目录创建一个目录
            file3.mkdirs();// 创建多个不纯在目录
            file2.delete();// 删除目录（目录有文件无法删除）
            //判断文件是否存在 exists()
            if (file.exists()) {
                System.out.println("wenjianzai");
            }else {
                System.out.println("wenjianbuzai");
            }
            System.out.println(file.getPath());// 获取文件路径
            System.out.println(file.getAbsolutePath());// 获取文件路径
            System.out.println(file.getParent());// 查看文件父目录
            file.renameTo(new File("D:\\javatest\\myjava.txt"));//重命名
            file.renameTo(new File("D:\\javatest\\mydir\\myjava.txt"));// 剪切
            long time = file.lastModified();
            Date date = new Date(time);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
            String lastM = sdf.format(date);
            System.out.println(file.getName() + "=====" + file.length() + "=====" + lastM);

        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
