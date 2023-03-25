package com.ani.dp;

public class SingletonPatternDemo {
     public static void main(String[] args) {
        
        Db db1 = Db.getInstance();
        db1.printStatus();

        Db db2 = Db.getInstance();
        db2.printStatus();
     }
}

class Db {

    private static Db db;

    private Db() { }

    public static synchronized Db getInstance() {
        if(db == null) db = new Db();

        return db;
    }

    public void printStatus() {
        System.out.println("Connected Successfully " + hashCode());
    }
}
