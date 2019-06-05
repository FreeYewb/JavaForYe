package com.ibefeng.first04.second.myString;

public class TestSplit {
    public static void main(String[] args) {
        String str = "爱我爱你中华，我爱我中华，我爱我中华爱";
        
        for (int i = 0; i < str.length(); i++) {
            Character cs = str.charAt(i);
            System.out.println(cs);
        }
        
        
//        int index = 0;
//        int count = 0;
//        while (index != -1) {
//            index = str.indexOf("爱");
//            str = str.substring(index + 1);
//            count++;
//        System.out.println(str);
//        }
//
//        System.out.println(count);
//
    }
}
