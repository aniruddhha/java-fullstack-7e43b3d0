package com.ani.ic;

public class IcDemos {
    
    private class DataSwapper implements Runnable {
        @Override
        public void run() {
            
        }
    }

    private class Tiger extends Animal {

        @Override
        public void walk() {
        }

        @Override
        public void eat() {
        }
    }

    public void demo1() {
        Outer out = new Outer();

        Outer.NormalInner ni = out.new NormalInner();
        ni.accessOuter();

        Outer.StaticInner si = new Outer.StaticInner();
        si.accessOuter();

        out.display();
      
    }

    public void demo2() {
        Runnable mapper = new DataMapper();

        Runnable swapper = new DataSwapper();
    }

    public void demo3() {

        class DataTopper implements Runnable {
            @Override
            public void run() {
                
            }
        }

        Runnable topper = new DataTopper();
    }

    public void demo4() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
            }
        };
    }

    public void demo5() {
        Animal tiger = new Tiger();
        tiger.walk();

        Animal animal = new Animal() {

            @Override
            public void walk() {
            }

            @Override
            public void eat() {
            }
        };
        animal.walk();
    }
}
