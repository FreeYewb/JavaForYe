package com.bo.wen.ye.MIDI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGuil {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame = new JFrame();// 创建frame
        JButton button = new JButton("click me");// 创建button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 程序会在window关闭时结束
        frame.getContentPane().add(button);// 把button加到frame的pane上

        frame.setSize(400, 400);// 设定frame大小
        frame.setVisible(true);// 把frame显示出来
    }

}
