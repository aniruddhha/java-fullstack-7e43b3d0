package com.ani.ic;

public class Outer {
    
    private int data = 10;

    public class NormalInner {

        private int dataInner = 90;

        public void accessOuter() {
            data = 90;
            System.out.println(data);
        }
    }

    public static class StaticInner {
        
        public void accessOuter() {
            // data = 10;
        }
        
    }

    public void display() {
        int i = 10;

        class Formatter { }

        Formatter fmt = new Formatter();
    }
}
