package com.bo.wen.ye.shuzu5;

public class DynamicArray {
    public static void main(String[] args) {
        Other.main1(new String[] { "fiddle", "de", "dum" });
    }

}

class Other {

    public static void main1(String[] args) {
        for (String s : args) {
            System.out.println(s + "");
        }
    }
}