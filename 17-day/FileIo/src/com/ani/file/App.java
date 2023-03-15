package com.ani.file;

import com.ani.file.ops.FileHandling;

public class App {

    public static void fileDemos() {
        FileHandling fh = new FileHandling();
        fh.demo12();
        fh.demo13();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 File Handling 🔥");

        fileDemos();
    }
}
