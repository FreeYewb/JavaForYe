package com.bo.wen.ye.junit;

public class SystemEnvironment implements Environmental {
    public long getTime() {
        System.out.println(System.currentTimeMillis());
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {
        SystemEnvironment environment = new SystemEnvironment();
        environment.getTime();
    }

    public void playWavFile() {
        // TODO Auto-generated method stub

    }
}
