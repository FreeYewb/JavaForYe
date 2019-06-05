package com.bo.wen.ye.initialize;

/**
 * 
 * @ClassName: Chess
 * @Description: TODO(无参构造函数的顺序次数)
 * @author yewenbo
 * @date 2018年10月29日 下午4:23:29
 *
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();

    }
}

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}