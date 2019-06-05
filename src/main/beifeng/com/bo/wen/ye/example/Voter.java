package com.bo.wen.ye.example;

/**
 * 
 * @ClassName: Voter
 * @Description: TODO(一群人进行投票，每个选票只能投一次，并且当投票总数为100时，停止投票)
 * @author yewenbo
 * @date 2018年10月17日 上午11:22:35
 *
 */
public class Voter {
    static int count;
    static final int Total = 100;

    String name;

    public Voter() {

    }

    public Voter(String name) {
        this.name = name;
    }
    public static void vote() {
        if (count >= Total) {
            System.out.println("投票结束");
        }
        else {
            count++;
        }
    }

    public void showResult() {
        System.out.println("当前投票" + count + "感谢" + name + "的投票");
    }
}
