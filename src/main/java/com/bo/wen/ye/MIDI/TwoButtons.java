package com.bo.wen.ye.MIDI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();

    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I 'm a label");

        // MyDrwPanel drawPanel = new MyDrwPanel();
        Sd sd = new Sd();
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, sd);
        frame.getContentPane().add(BorderLayout.WEST, labelButton);
        frame.getContentPane().add(BorderLayout.EAST, label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            label.setText("Ouch");// 内部可以存取label
        }

    }

    class ColorListener implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            frame.repaint();// 直接存取frame，不需要明确指定外部类的引用
        }

    }

    class Sd extends JPanel {
        public void paintComponent(Graphics g) {
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
}
