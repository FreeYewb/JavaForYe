package com.ibefeng.first04.first.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @ClassName: TestMap
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月24日 下午10:42:04
 *
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, "a");
        map.put("2", "b");
        map.put("3", "c");
        for (Object key : map.keySet()) {
            System.out.println(map.get(key));
        }

        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object val = map.get(key);
            System.out.println(key + "..." + val);
        }
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsValue("a"));
    }
}
