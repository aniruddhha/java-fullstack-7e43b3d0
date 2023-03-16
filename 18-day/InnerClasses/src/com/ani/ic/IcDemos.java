package com.ani.ic;

public class IcDemos {
    
    public void demo1() {
        Outer out = new Outer();

        Outer.NormalInner ni = out.new NormalInner();
        ni.accessOuter();

        Outer.StaticInner si = new Outer.StaticInner();
        si.accessOuter();

        out.display();
      
    }
}
