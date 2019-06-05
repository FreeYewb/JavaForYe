package com.ibefeng.first04.second.myString;

public class TestStringBuffer02 {
    public static void main(String[] args) {
        StringBuffer strnum = new StringBuffer("12345678");
        for (int i = 3; i < strnum.length(); i = i + 3) {
            strnum.insert(i, ",");
            i++;
        }
        System.out.println(strnum.toString());
    }
}
