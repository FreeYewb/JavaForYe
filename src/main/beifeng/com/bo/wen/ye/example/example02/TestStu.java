package com.bo.wen.ye.example.example02;

public class TestStu {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.setAge(-1);
        }
        catch (StuException e) {
            // TODO: handle exception
            System.err.println(e.getMessage());
        }

    }
}
