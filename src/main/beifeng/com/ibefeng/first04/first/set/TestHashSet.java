package com.ibefeng.first04.first.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * @ClassName: TestHashSet
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月24日 下午10:41:52
 *
 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("jt");
        set.add("jt");
        set.add("jt");
        set.add("jt2");
        System.out.println(set.size());
        // 迭代
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
