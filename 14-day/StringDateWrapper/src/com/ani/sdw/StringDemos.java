package com.ani.sdw;

public class StringDemos {

    public void demo1() {
        String nm = "abc";
        System.out.println(nm.hashCode());
        nm = nm + "pqr" ;
        System.out.println(nm.hashCode());
    }

    public void demo2() {
        String nm = "abc"; // created memory pool

        String ab = new String("abc"); // created by new keyword
        System.out.println(" NM Equals AB = " + nm.equals(ab));
        System.out.println(" NM == AB " + (nm == ab));

        String pp = "abc"; // created memory pool
        System.out.println(" PP Equals NM = " + pp.equals(nm));
        System.out.println(" PP == NM " + (pp == nm));
    }
}
