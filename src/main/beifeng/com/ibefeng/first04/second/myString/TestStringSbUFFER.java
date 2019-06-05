package com.ibefeng.first04.second.myString;

public class TestStringSbUFFER {
    public static void main(String[] args) {
        String str = new String();
        str = "你好";
        int num = 0;

        str = str + num;
        
        StringBuffer buffer = new StringBuffer();
        buffer.append("hello");
        buffer.append("xiaoyuer!");

        buffer.insert(5, "+");
        System.out.println(buffer.toString());
    }
}
