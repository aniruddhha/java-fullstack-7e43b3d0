package com.ani.file.ops;

import java.io.File;
import java.io.IOException;

public class FileHandling {

    public void demo1() {
        // File file = new File("src/com/ani/file/ops/");
        File file = new File("files");
        System.out.println(file.getAbsolutePath());

        if(file.isDirectory()) {
            System.out.println("📂 This is a Directory");

            File sub = new File(file, "test1");
            boolean stsSub = sub.exists();
            System.out.println(!stsSub ? "✅ Successfuly Created" : "❌ Directory Already Exists");
            if(!stsSub)
                sub.mkdir();

            File subFile = new File(sub, "abc.txt");
            boolean sts = false;
            try {
                sts = subFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(sts ? "✅ Successfuly Created" : "❌ File Already Exists");
        } else {
            System.out.println("📝 This is a File");
        }
    }
    
}
