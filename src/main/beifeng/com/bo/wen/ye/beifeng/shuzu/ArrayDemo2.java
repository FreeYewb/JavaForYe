package com.bo.wen.ye.beifeng.shuzu;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 2 }, { 5, 2 } };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // System.out.print(arr[i][j] + " ");
                sum = sum + arr[i][j];

            }
            // System.out.println();
        }
        System.out.println(sum);
    }
}
