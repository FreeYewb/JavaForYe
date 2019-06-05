package com.bo.wen.ye.sanke;

public class Map {
    int snakeX = 0;
    int snakeY = 0;
    int score = 0;
    int[][] map = new int[12][12];

    public void Map(int snakeY, int snakeX, int map[][]) {
        this.snakeX = snakeX;
        this.snakeY = snakeY;
        int[][] temp = new int[12][12];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                temp[i][j] = map[i][j];
            }
        }
        this.map = temp;// 避免直接引用
    }

    public int getSnakeX() {
        return snakeX;
    }

    public void setSnakeX(int snakeX) {
        this.snakeX = snakeX;
    }

    public int getSnakeY() {
        return snakeY;
    }

    public void setSnakeY(int snakeY) {
        this.snakeY = snakeY;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }
}
