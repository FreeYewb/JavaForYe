package com.ibefeng.first04.first.instanceof01;

/**
 * 
 * @ClassName: instanceoftest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2019年4月24日 下午10:41:23
 *
 */
class instanceoftest {
public static void main(String[] args) {
            A a=null;
 B b=null;
 boolean res; 

System.out.println("instanceoftest test case 1: ------------------");
 res = a instanceof A; 
System.out.println("a instanceof A: " + res);

res = b instanceof B;
System.out.println("b instanceof B: " + res);
System.out.println("/ninstanceoftest test case 2: ------------------");
a=new B();
b=new B();

res = a instanceof A; 
System.out.println("a instanceof A: " + res);
 res = a instanceof B;
System.out.println("a instanceof B: " + res);

res = b instanceof A;
System.out.println("b instanceof A: " + res);
        res = b instanceof B;
        System.out.println("b instanceof B: " + res);
        System.out.println("/ninstanceoftest test case 3: ------------------");
        B b2 = (C) new C();
        res = b2 instanceof A;
        System.out.println("b2 instanceof A: " + res);

        res = b2 instanceof B;
        System.out.println("b2 instanceof B: " + res);

        res = b2 instanceof C;
        System.out.println("b2 instanceof C: " + res);
    

}
}
