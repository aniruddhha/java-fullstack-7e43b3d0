package com.ani.file;

import java.util.logging.FileHandler;

import com.ani.file.ops.FileHandling;

public class App {

    public static void fileDemos() {
        FileHandling fh = new FileHandling();
        fh.demo4();
        fh.demo5();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 File Handling 🔥");

        fileDemos();
    }
}
