package com.bo.wen.ye.mingrisoft;

public class YanghuiTriangle {
    public static void main(String[] args) {
        int triangle[][] = new int[3][];
        // 遍历二维数组的第一层
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i];
            // 遍历第二层数组
            for (int j = 0; j <= triangle[i].length - 1; j++) {
                // 将俩侧的数组元素赋值为1
                if (i == 0 || j == 0 || j == triangle[i].length - 1) {
                    triangle[i][j] = 1;
                }
                else {
                    triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
                }
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
