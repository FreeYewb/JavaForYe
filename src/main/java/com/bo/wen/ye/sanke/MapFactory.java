package com.bo.wen.ye.sanke;

//空是0，墙是1，面包是2,蛇头向右是6
public class MapFactory {
    static int map[][] =
    {
        {1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,2,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,6,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,1},  
        {1,1,1,1,1,1,1,1,1,1,1,1}
            };

    public static int[][] getMap() {
        int temp[][] = new int[12][12];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                temp[i][j] = map[i][j];
            }
        }
        return temp;
    }
}
