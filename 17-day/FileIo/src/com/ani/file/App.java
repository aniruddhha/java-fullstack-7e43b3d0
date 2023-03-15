package com.ani.file;

import com.ani.file.ops.FileHandling;

public class App {

    public static void fileDemos() {
        FileHandling fh = new FileHandling();
        fh.demo14();
        fh.demo15();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 File Handling 🔥");

        fileDemos();
    }
}
