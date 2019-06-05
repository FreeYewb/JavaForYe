package com.bo.wen.ye.example.example03;

public class TestZoo {
    public static void main(String[] args) {
        Animal cat = new Cat("jf", 4);
        Animal dol = new Dolphin("ht", 0);
        Animal duck = new Duck("tly", 2);

        Master master = new Master();
        System.out.println("dwmz \t tdts \t dwj");

        Animal[] animal = new Animal[] { cat, duck, dol };

        for (Animal an : animal) {
            master.show(an);
        }

    }
}
