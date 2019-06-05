package com.bo.wen.ye.beifeng.myinterface;

public class Theftproofdoor extends Door implements Lock {

    @Override
    public void open() {
        // TODO Auto-generated method stub
        System.out.println("开门");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        System.out.println("关门");
    }

    @Override
    public void lockup() {
        // TODO Auto-generated method stub
        System.out.println("转，关");
    }

    @Override
    public void openlock() {
        // TODO Auto-generated method stub
        System.out.println("转，开");
    }

}
