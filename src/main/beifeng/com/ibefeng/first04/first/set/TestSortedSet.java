package com.ibefeng.first04.first.set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * @ClassName: TestSortedSet
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月24日 下午10:41:58
 *
 */
public class TestSortedSet {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();
        set.add("nihao");
        System.out.println(set.hashCode());
        set.add("good");
        System.out.println(set.hashCode());
        set.add("good");
        System.out.println(set.hashCode());
        set.add("nio");

        System.out.println(set.size());

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println(set.hashCode());
    }
}
