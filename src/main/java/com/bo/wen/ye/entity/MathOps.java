package com.bo.wen.ye.entity;
import java.util.Random;
public class MathOps {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Create a seeded random number generafor创建一个种子随机数字
        Random rand = new Random();
        int i, j, k;
        // Choose value from 1 to 100;
        j = rand.nextInt(100) + 1;
        System.out.println("j" + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k" + k);
        i = j + k;
        System.out.println("j+k" + i);
        i = j - k;
        System.out.println("j-k" + i);
        i = k / j;
        System.out.println("k/j" + i);
        i = k * j;
        System.out.println("k*j" + i);
    }

}
