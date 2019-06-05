package com.bo.wen.ye.shuzu5;

import java.util.Arrays;

/**
 * 
 * @ClassName: ArraysOfPrimitives
 * @Description: TODO(这里用一句话描述这个类的作用) 引用地址，数组值的改变，引用相同地址的其他数组跟着改变
 * @author yewenbo
 * @date 2018年9月26日 下午4:21:10
 *
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i] = a2[i] + 1;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println("a1[" + i + "] = " + a1[i]);

        }
        System.out.println(Arrays.toString(a1));
    }
}
