package com.ani.testing.file;

import java.io.File;

public class FileHandling {
    
    public String readFile(String name) {

        File fl = new File(name);
        if(!fl.exists()) {
            throw new RuntimeException(); // here you can throw your own exception
        }
        return null;
    }
}
