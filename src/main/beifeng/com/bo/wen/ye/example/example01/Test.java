package com.bo.wen.ye.example.example01;

public class Test {

    public static void main(String[] args) {
        int x = 2, y = 3;
        switch (x) {
        // TODO default下面还有其他的选项的话，会重复继续下去
        default:
            y++;
        case 3:
            y++;
        case 4:
            y++;

        }
        System.out.println(y);
    }

    // public static void main(String[] args) {
    // boolean b = true;
    // if (b = false) {// TODO 这边的b判断不符合，把b赋值成false 注意点在这
    // System.out.println("a");
    // }
    // else if (b == true) {
    // System.out.println("b");
    // }
    // else if (!b) {
    // System.out.println("c");
    // }
    // System.out.println(b);
    // }

}
