package com.bo.wen.ye.mingrisoft;

/**
 * 
 * @ClassName: ErgodicArray
 * @Description: TODO(使用while与自增运算符循环遍历数组)
 * @author yewenbo
 * @date 2018年8月29日 上午9:33:50
 *
 */
public class ErgodicArray {
    public static void main(String[] args) {
        String[] aves = new String[] { "niao1", "niao2", "niao3" };
        int index = 0;// 创建索引变量
        while (index < aves.length) {// 遍历数组
            System.out.println(aves[index++]);// 自增索引值
        }
    }
}
