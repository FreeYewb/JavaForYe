package com.ibefeng.first04.first.Araaylist;

import java.util.ArrayList;

/**
 * 
 * @ClassName: myArraylist
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月24日 下午5:17:22
 *
 */
public class myArraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(13);
        int size = list.size();
        list.get(1);
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
        list.add(2, 18);// 按索引位置添加
        for (Object li : list) {
            System.out.println(li);
        }
        list.remove((Object) 12);
        // 判断是否数组有这元素
        if (list.contains(12)) {
            System.out.println("you12");
        }
    }
}
