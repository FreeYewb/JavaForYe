package com.bo.wen.ye.example.example02;

/**
 * 普通手机
 * 
 * @ClassName: CommonHandset
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月15日 下午5:45:55
 *
 */

public class CommonHandset extends Handset implements PlayWiring {

    @Override
    public void sendInfo() {
        // TODO Auto-generated method stub
        System.out.println("发送文字的信息");
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        System.out.println("语言通话");
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
        System.out.println("发送介绍的信息");
    }

    @Override
    public void play(String music) {
        // TODO Auto-generated method stub
        System.out.println("发送介绍的信息" + music);
    }

}
