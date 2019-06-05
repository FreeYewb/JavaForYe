package com.bo.wen.ye.entity;

public class Tree {
    int height;

    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is" + height + "feel tall");
    }

    void info() {
        System.out.println("Tree is" + height + "feet tall");
    }

    void info(String s) {
        System.out.println(s + ":Tree" + height + "free tall");
    }
}
