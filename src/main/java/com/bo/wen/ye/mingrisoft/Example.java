package com.bo.wen.ye.mingrisoft;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 
 * @ClassName: Example
 * @Description: TODO(加密 位运算)
 * @author yewenbo
 * @date 2018年8月28日 下午5:28:16
 *
 */
public class Example {
    public static void main(String[] args) throws FileNotFoundException {

            PrintStream out = System.out;// 保存原输出流
            PrintStream ps = new PrintStream("src/main/resources/log.txt");// 创建文件输出流
            System.setOut(ps);// 设置使用新的输出流
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入一个英文字符串或解密字符串");
            System.out.println("请输入一个英文字符串或解密字符串");
            String password = scan.nextLine();// 获取用户输入
            System.out.println(password);
            char[] array = password.toCharArray();// 获取字符串数组
            for (int i = 0; i < array.length; i++) {// 遍历字符数组
                array[i] = (char) (array[i] ^ 200);// 对每个数组元素进行异或运算
            }
            System.out.println("加密或解密结果如下：");
            System.out.println(new String(array));// 输出秘钥
            System.setOut(out);// 回复原有输出流
            System.out.println("程序运行完毕，请查看日志文件");


    }
}
