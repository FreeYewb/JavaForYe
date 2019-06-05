package com.bo.wen.ye.example.example02;

/**
 * 智能手机
 * 
 * @ClassName: AptitudeHandset
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月15日 下午5:46:08
 *
 */
public class AptitudeHandset extends Handset {

    @Override
    public void sendInfo() {
        // TODO Auto-generated method stub
        System.out.println("发送带图片和文字的信息");
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        System.out.println("开始视频通话");
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
        System.out.println("开始介绍");
    }

}
