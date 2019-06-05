package com.ibefeng.first04.first.map;

/**
 * S
 * 
 * @ClassName: TestCollection
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月24日 下午10:41:43
 *
 */
public class TestCollection extends Person {
    public static void main(String[] args) {
        if ("a" instanceof String) {
            System.out.println("a");
        }
        TestCollection n1 = null;
        if (n1 instanceof TestCollection) {
            System.out.println("b");
        }
        n1 = new TestCollection();
        if (n1 instanceof TestCollection) {
            System.out.println("c");
        }
        if (n1 instanceof Object) {
            System.out.println("d");
        }
        Object obj = new TestCollection();
        if (obj instanceof TestCollection) {
            System.out.println("e");
        }
        TestCollection n2 = new TestCollection();
        if (n2 instanceof Person) {
            System.out.println("f");
        }

    }
}

class Person {

}