package com.bo.wen.ye.example.example03;

import java.util.Scanner;

public class Master {

    Animal[] animal = new Animal[3];
    Scanner input = new Scanner(System.in);
    public Master() {
        animal[0] = new Cat("jf", 4);
        animal[1] = new Dolphin("ht", 0);
        animal[2] = new Duck("tly", 2);
    }
    public void show(Animal a) {
        for (Animal an : animal) {
        System.out.println(a.getName() + "\t" + a.getLegs() + "\t" + a.shout());
    }
    }

    public void update() {

        int key = input.nextInt();
        switch (key) {
        case 1:
            // TODO XIUGAI
            show2();
            break;

        default:
            break;
        }
    }

    public void show2() {
        System.out.println("mmc");

        input.nextInt();
        String catName = input.next();
        animal[0].setName(catName);
        String cat = input.next();
        animal[0].setName(catName);
    }
}
