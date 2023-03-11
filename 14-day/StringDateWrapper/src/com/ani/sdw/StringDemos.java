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

    public void demo3() {
        String nm = "abcpqr";

        System.out.println("👉 Original "+ nm);
        System.out.println("👉 Length "+ nm.length());
        System.out.println("👉 0th "+ nm.charAt(0));
        System.out.println("👉 Sub String(0, 3) "+ nm.substring(0, 3));
        System.out.println("👉 Upper "+ nm.toUpperCase());
        System.out.println("👉 Lower "+ nm.toLowerCase());

        String address = "street food";
        System.out.println(address + " -> " + nm);
        System.out.println(address.concat(nm));

        char[] arr = nm.toCharArray();
        for( char c : arr ) {
            System.out.println(c);
        }

        System.out.println("👉 Equal Ignore Case : " + nm.equalsIgnoreCase("ABCPQR"));
        String st = "abc              ";
        System.out.println("👉 Trim " + st.trim());
    }

    public void demo4() {
        String nm = "a->b->c->d->e->f"; // abcdef
        System.out.println("👉 Original : " + nm);
        String[] arr = nm.split("->"); // [ a, b, c ,d, e, f ]

        System.out.println("👉 Converted to Array ");
        for(String s : arr) {
            System.out.println(s);
        }
        
        String joined = String.join("", arr); // 
        System.out.println("👉 Joined : "+joined);
    }
}
