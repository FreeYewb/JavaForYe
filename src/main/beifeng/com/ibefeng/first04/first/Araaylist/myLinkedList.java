package com.ibefeng.first04.first.Araaylist;

import java.util.LinkedList;

/**
 * 
 * @ClassName: myLinkedList
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月24日 下午10:42:22
 *
 */
public class myLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.addFirst(0);
        System.out.println(list.getFirst());
    }
}
