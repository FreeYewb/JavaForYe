/**
 * 
 */
package com.bo.wen.ye.MIDI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.JPanel;

/**
 * @author Administrator
 *
 */
public class MyDrawPanel extends JPanel implements ControllerEventListener {// 这个面板也是监听者
    boolean msg = false;

    public void controlChange(ShortMessage arg0) {
        // TODO Auto-generated method stub
        msg = true;
        repaint();// 获知事件时设为真并调用重绘程序
    }

    public void paintComponent(Graphics g) {
        if (msg) {// 因为也有其他东西会引发重绘，所以要判断是否为ControllerEvent所引发的
            Graphics2D g2 = (Graphics2D) g;

            int r = (int) (Math.random() * 250);
            int gr = (int) (Math.random() * 250);
            int b = (int) (Math.random() * 250);

            g.setColor(new Color(r, gr, b));

            int ht = (int) ((Math.random() * 120) + 10);
            int width = (int) ((Math.random() * 120) + 10);
            int x = (int) ((Math.random() * 40) + 10);
            int y = (int) ((Math.random() * 40) + 10);
            g.fillRect(x, y, width, ht);
            msg = false;
        }
    }

}
