package com.bo.wen.ye.example;

public class TestVoter {
    public static void main(String[] args) {
        Voter v1 = new Voter("张战");
        v1.vote();
        v1.showResult();
        System.out.println("=======");
        for (int i = 0; i < 100; i++) {
            Voter.vote();
        }
        v1.showResult();
    }
}
