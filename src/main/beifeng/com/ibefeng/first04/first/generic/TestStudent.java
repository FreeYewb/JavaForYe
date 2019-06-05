package com.ibefeng.first04.first.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



/**
 * 
 * @ClassName: TestStudent
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月24日 下午10:58:48
 *
 */
public class TestStudent {
    public static void main(String[] args) {

        Student stu1 = new Student("ll", "ss");
        Student stu2 = new Student("ll", "ss");
        HashMap<String, Student> stu = new HashMap<String, Student>();
        stu.put("lm", stu1);
        stu.put("zg", stu2);

        Set<String> set = stu.keySet();
        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            String key = it.next();
            Student st = stu.get(key);
            System.out.println(st.getName() + st.getSex());
        }
    }
}
