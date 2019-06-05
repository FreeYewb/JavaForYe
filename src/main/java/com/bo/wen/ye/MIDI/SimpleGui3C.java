package com.bo.wen.ye.MIDI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGui3C {
    JFrame frame;
    int x = 5;
    int y = 5;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JButton button = new JButton("Change colors");
        // button.addActionListener(this);

        // MyDrwPanel drwPanel = new MyDrwPanel();
        MydrawPanel1 d = new MydrawPanel1();
        frame.getContentPane().add(d);
        frame.setSize(1000, 1300);
        frame.setVisible(true);
        for (int i = 0; i < 130; i++) {
            x = x + 5;
            y = y + 5;

            d.repaint();

            try {
                Thread.sleep(50);
            }
            catch (Exception e) {
                // TODO: handle exception
            }

        }

    }

    // public void actionPerformed(ActionEvent arg0) {
    // // TODO Auto-generated method stub
    // frame.repaint();// 当用户按下按钮时就要求frame重新绘制
    //
    // }

    class MydrawPanel1 extends JPanel {

        public void paintComponent(Graphics g) {
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            red = (int) (Math.random() * 255);
            green = (int) (Math.random() * 255);
            blue = (int) (Math.random() * 255);
            Color randomColor1 = new Color(red, green, blue);
            g.setColor(randomColor1);
            g.fillRect(x, y, 100, 100);
        }
    }

}
