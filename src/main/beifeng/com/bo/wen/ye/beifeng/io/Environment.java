package com.bo.wen.ye.beifeng.io;

import java.util.Map;
import java.util.Map.Entry;

public class Environment {
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        for (Entry<String, String> entry : env.entrySet()) {
            System.out.println("KEY" + entry.getKey() + "\t");
            System.out.println("VALUE" + entry.getValue());
        }
        String s = System.getenv("JAVA_HOME");
        System.out.println(s);
    }
}
