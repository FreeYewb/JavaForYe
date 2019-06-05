package com.bo.wen.ye.beifeng.shuzu;

public class ArrayDemo {
    public static void main(String[] args) {
        /**
         * 声明一个int类型的数组
         */
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // ArrayIndexOutOfBounds 数组下标越界
        // System.out.println(arr[3]);
        arr[0] = 1;
        arr[2] = 2;
        arr[1] = 0;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        char[] a = new char[3];
        System.out.println(a[1]);
    }
}
