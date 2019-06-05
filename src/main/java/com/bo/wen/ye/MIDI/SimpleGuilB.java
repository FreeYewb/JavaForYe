package com.bo.wen.ye.MIDI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGuilB implements ActionListener {
    JButton button = new JButton();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SimpleGuilB gui = new SimpleGuilB();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);// 向按钮注册
        frame.getContentPane().add(button);
        MyDrwPanel drwPanel = new MyDrwPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {// 处理事件的方法
        // TODO Auto-generated method stub
        button.setText("I 've been clicked");// 按钮会以ActionEvent对象作为参数来调用此方法
    }



}
