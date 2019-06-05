package com.bo.wen.ye.entity;

import java.util.Random;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random ran = new Random();
        for (int i = 0; i < 100; i++) {
            int c = ran.nextInt(26) + 'a';
            System.out.print((char) c);
        }
    }

}
