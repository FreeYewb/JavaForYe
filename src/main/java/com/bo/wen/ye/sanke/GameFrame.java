package com.bo.wen.ye.sanke;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements ActionListener, MouseListener, KeyListener, Runnable {

    private int countTime = 0;
    private int overTime = 500;// 默认0.5秒移动一次
    private int snakeX = 5;
    private int snakeY = 5;
    private int score = 0;
    private int flag = 1;
    private int leftX = 0, leftY = 0;// 地图左上角坐标
    // private int mapRow = 0,mapColumn = 0;//地图的行列数
    private int width = 0, height = 0;// 屏幕大小
    private boolean acceptKey = true;
    private Image pic[] = null;
    private int[][] map = null;
    private ArrayList<Node> snake = new ArrayList<Node>();// 存储蛇的每个部分的状态及坐标
    Sound sound;

    final int WALL = 1, FOOD = 2, SNAKEHEADUP = 3, SNAKEHEADDOWN = 4, SNAKEHEADLEFT = 5, SNAKEHEADRIGHT = 6,
            SNAKEBODYUP = 7, SNAKEBODYDOWN = 8, SNAKEBODYLEFT = 9, SNAKEBODYRIGHT = 10;

    public static void main(String[] args) {
        new GameFrame();
    }

    public GameFrame() {
        super("贪吃蛇游戏带音乐版");
        setSize(600, 600);
        setVisible(true);
    }

    public class Node
    {
        int state;
        int x;
        int y;

        public Node(int state, int x, int y) {
            this.state = state;
            this.x = x;
            this.y = y;
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }


    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
