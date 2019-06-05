package com.bo.wen.ye.mingrisoft;

import java.io.PrintStream;

/**
 * 
 * @ClassName: RedirectOutputStream
 * @Description: TODO(重定向输出流实现程序日志)
 * @author yewenbo
 * @date 2018年8月28日 下午5:22:39
 *
 */
public class RedirectOutputStream {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;// 保存原输出流
            PrintStream ps = new PrintStream("src/main/resources/log.txt");// 创建文件输出流
            System.setOut(ps);// 设置使用新的输出流

            int age = 18;
            System.out.println("年龄变量成功定义，初始值为18");
            String sex = "女";
            System.out.println("性别变量成功定义，初始值为女");
            // 整合俩个变量

            String info = "这是个" + sex + "孩子，应该有" + age + "岁了";
            System.out.println("整合俩个变量为info字符串变量，其结果是" + info);
            System.setOut(out);// 回复原有输出流
            System.out.println("程序运行完毕，请查看日志文件");
        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
