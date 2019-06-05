package com.bo.wen.ye.entity;

import java.util.ArrayList;
import java.util.List;
public class Dog {
    public String name;
    public String says;
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("3");
        list.add("2");
        
        for (String str:list) {
            System.out.println(str);
            // list.add("2");
        }
        
        
    }
}
