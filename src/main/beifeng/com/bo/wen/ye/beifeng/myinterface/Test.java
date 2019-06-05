package com.bo.wen.ye.beifeng.myinterface;

public class Test {

    public static void main(String[] args) {
        Door door = new Theftproofdoor();
        Lock lock = new Theftproofdoor();
        door.close();
        lock.lockup();
        lock.openlock();
        door.open();

        Theftproofdoor theftproofdoor = (Theftproofdoor) door;
        theftproofdoor.lockup();
        theftproofdoor.openlock();
        theftproofdoor.open();
    }
}
