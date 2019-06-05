package com.bo.wen.ye.MIDI;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyDrwPanel extends JPanel {
    public void paintComponent(Graphics g) {// 这是非常重要的方法，你决不能自己调用，要由系统来调用
        // 1
        // g.setColor(Color.orange);
        // g.fillRect(20, 50, 100, 100);
        // Image image = new ImageIcon("pic.jpg").getImage();
        // g.drawImage(image, 3, 4, this);

        // 2
        // g.fillRect(0, 0, this.getWidth(), this.getHeight());
        // int red = (int) (Math.random() * 255);
        // int green = (int) (Math.random() * 255);
        // int blue = (int) (Math.random() * 255);
        // Color randomColor = new Color(red, green, blue);
        // g.setColor(randomColor);
        // g.fillOval(70, 70, 100, 100);// 填满参数指定的椭圆形区域

        // 3
        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
         int green = (int) (Math.random() * 255);
         int blue = (int) (Math.random() * 255);
         Color randomColor = new Color(red, green, blue);
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color randomColor2 = new Color(red, green, blue);
        GradientPaint gradient = new GradientPaint(70, 70, randomColor, 150, 150, randomColor2);

        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
}
