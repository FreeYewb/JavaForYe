package com.bo.wen.ye.game;
import java.awt.Color;//颜色
import java.awt.Container;//容器

import javax.swing.JFrame;

//java.awt：java.awt是一个软件包，早期编写图形界面应用程序的包。如Color类，Font类。
//javax.swing：为解决 AWT 存在的问题而新开发的图形界面包。Swing是对AWT的改良和扩展。
public class DrawSee extends JFrame{
    private Color rectColor = new Color(0xf5f5f5);

    public DrawSee() {
        Container p = getContentPane();// 获取窗口的内容面板
        setBounds(100, 100, 500, 500);// 调用父类setBounds方法，移动窗口到(100,100)位置，并设置窗口大小为宽500，高500
        setVisible(true);// 调用父类setVisible方法
        p.setBackground(rectColor);// 调用对象p的setBackground方法，设置窗口背景颜色
        setLayout(null);
        setResizable(false);// 调用父类setResizable方法，false表示不允许窗口最大化
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 调用父类setDefaultCloseOperation方法，指定窗口关闭时退出程序。
    }

}
