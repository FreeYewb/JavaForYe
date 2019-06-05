package com.bo.wen.ye.example.example03;

public abstract class Animal {
    private String name;
    private int legs;

    public Animal() {
    }

    public Animal(String name, int legs) {
        super();
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public abstract String shout();
}
