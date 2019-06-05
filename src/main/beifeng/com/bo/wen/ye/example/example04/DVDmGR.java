package com.bo.wen.ye.example.example04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @ClassName: DVD管理类
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月23日 下午9:26:20
 *
 */
public class DVDmGR {
    DVD[] dvd = new DVD[3];

    /**
     * 
     * 初始化DVD数据 @Description: TODO(这里用一句话描述这个方法的作用) @param 设定文件 @return @throws
     */
    public DVDmGR() {
        dvd[0] = new DVD("lmjr", "yj", "2017-04-23", 30);
        dvd[1] = new DVD("fshq", "j");
        dvd[2] = new DVD("lmmw", "j");

    }

    public void show() {
        System.out.println(".............");
        for (DVD dv : dvd) {
            System.out.println(dv.getName());
        }
        System.out.println(".............");
    }

    public void add(DVD dv) {
        // TODO 这边的位置调换原理要搞清楚
        int oldLen = dvd.length;
        int newLen = oldLen + 1;
        dvd = Arrays.copyOf(dvd, newLen);
        System.out.println(dvd[newLen - 1] + ".....");
        dvd[newLen - 1] = dv;
        System.out.println(dvd[newLen - 2] + ".....");
    }
    public void run() {
        int key = 0;
        do {
        System.out.println("qxz");
        Scanner input = new Scanner(System.in);
         key = input.nextInt();
        switch (key) {
        case 0:
            System.out.println("--->phb");

            show();
            break;
            case 1:
                System.out.println("xinczeng");
                String name = input.next();
                DVD dvd = new DVD();
                dvd.setName(name);
                add(dvd);
                System.out.println("xinzeng" + name + "!");
                break;
        case 6:
            System.out.println("xxsy");
            
            break;
        }
        }
        while (key != 6);
    }
}
