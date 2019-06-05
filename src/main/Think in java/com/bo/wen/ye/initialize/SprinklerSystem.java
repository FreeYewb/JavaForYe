package com.bo.wen.ye.initialize;

/**
 * 
 * @ClassName: SprinklerSystem
 * @Description: (组合语法)
 * @author yewenbo
 * @date 2018年10月29日 上午10:29:47
 *
 */
public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem [valve1=" + valve1 + ", valve2=" + valve2 + ", valve3=" + valve3 + ", valve4=" + valve4
                + ", source=" + source + ", i=" + i + ", f=" + f + "]";
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return "WaterSource [s=" + s + "]";
    }
}