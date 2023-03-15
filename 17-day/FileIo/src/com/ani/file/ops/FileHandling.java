package com.ani.file.ops;

import java.io.File;

public class FileHandling {

    public void demo1() {
        // File file = new File("src/com/ani/file/ops/");
        File file = new File("files");
        System.out.println(file.getAbsolutePath());

        if(file.isDirectory()) {
            System.out.println("📂 This is a Directory");
        } else {
            System.out.println("📝 This is a File");
        }
    }
    
}
