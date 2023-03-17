package com.ani.anno;

spublic class App {

    public static void demo1() {
        Tiger tg = new Tiger();
        tg.run();
        tg.runFast();

        String sts = CheckerImpl.checkFiled(tg);
        System.out.println(sts);
        
        // public static final Class<Tiger> class;
        Class<Tiger> cls = Tiger.class;
        System.out.println( cls.getName());
        System.out.println(cls.getSimpleName());
    }

    public static void demo2() {
        Account ac = new Account();
        GetSetProcessor.generateAccessors(ac);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 Annotations 🔥");

        demo2();
    }
}
