package com.bo.wen.ye.test;

import com.bo.wen.ye.entity.Dog;

public class DogTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "RUFF";
        Dog dog2 = new Dog();
        dog2.says = "Wurf";
        dog2.name = "scruffy";
        Dog dog3 = new Dog();
        dog3.name = "spot";
        System.out.println(dog1.name + dog1.says);
        System.out.println(dog2.name + dog2.says);
        System.out.println(dog3 == dog1);
        System.out.println(dog1.equals(dog3));
    }

}
