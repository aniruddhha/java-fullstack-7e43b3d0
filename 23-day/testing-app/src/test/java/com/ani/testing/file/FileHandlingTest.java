package com.ani.testing.file;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileHandlingTest {
    
    @Test
    public void testFileReading() {
        FileHandling fh = new FileHandling();
        fh.readFile("abc.txt");
    }

    @Test
    public void testFileExistsOrNot() {

        Assertions.assertThrows(RuntimeException.class, () -> {
            FileHandling fh = new FileHandling();
            fh.readFile("abc.txt");
        });
      
    }
}
