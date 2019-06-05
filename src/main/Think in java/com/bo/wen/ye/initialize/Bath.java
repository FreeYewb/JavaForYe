package com.bo.wen.ye.initialize;

/**
 * 
 * @ClassName: Bath
 * @Description: TODO(初始化4种)
 * @author yewenbo
 * @date 2018年10月29日 上午10:29:54
 *
 */
public class Bath {
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Bath");
        s3 = "joy";
        toy = 3.14f;
        castille = new Soap();
    }

    // Instance initialization实例初始化
    {
        i = 47;
    }


    public String toString() {
        if (s4 == null) {// Delayed initialization延迟初始化
            s4 = "joy";
        }
        return "Bath [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", s4=" + s4 + ", castille=" + castille + ", i=" + i
                + ", toy=" + toy + "]";
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}

class Soap {
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}