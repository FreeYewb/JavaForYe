package com.bo.wen.ye.isenum;

public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ".ordinal" + s.ordinal());
        }
    }
}
