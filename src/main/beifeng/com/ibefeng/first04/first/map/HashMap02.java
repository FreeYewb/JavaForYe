package com.ibefeng.first04.first.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName: HashMap02
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月24日 下午10:42:17
 *
 */
public class HashMap02 {
    public static void main(String[] args) {
        Map map = new HashMap();
        Student stu1 = new Student("宿舍", "三十万");
        Student stu2 = new Student("宿舍s", "三十万s");
        map.put("1", stu1);
        map.put("2", stu2);
        Student stu = (Student) map.get("1");
        System.out.println(stu.getName());

    }

}

class Student {
    private String name;
    private String sex;

    public Student() {

    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}