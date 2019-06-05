package com.bo.wen.ye.initialize;

/**
 * 
 * @ClassName: Cartoon
 * @Description: TODO(继承构造器顺序)
 * @author yewenbo
 * @date 2018年10月29日 下午3:37:59
 *
 */
public class Cartoon {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

class Art {
    Art() {
        System.out.print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}