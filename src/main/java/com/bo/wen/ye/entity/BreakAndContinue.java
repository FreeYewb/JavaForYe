package com.bo.wen.ye.entity;

public class BreakAndContinue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println();
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) {
                break;
            }

            if (i % 10 == 0) {
                continue;

            }
            System.out.println("i:" + i);
            

        }
    }

}
