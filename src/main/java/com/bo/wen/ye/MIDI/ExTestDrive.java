package com.bo.wen.ye.MIDI;

class MyEx extends Exception {

}
public class ExTestDrive {

    static void doRisy(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }

    }

    public static void main(String[] args) {
        String test = args[0];
        System.out.print("t");

        try {
            doRisy(test);
            System.out.print("r");
            System.out.print("o");

        }
        catch (MyEx e) {
            // TODO: handle exception
            System.out.print("a");

        }
        finally {
            System.out.print("w");
            System.out.println("s");
        }

    }
}
