package com.ani.file.ops;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import org.xml.sax.InputSource;

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
  
    public void demo2() {
        File file = new File("files/test1/abc.txt");

        file.getFreeSpace();
        file.getTotalSpace();
        file.getUsableSpace();
    }

    public void demo3() {

        File file = new File("files/test2/abc.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file);
            writer.write("This is first hello word 😀😀😀");
           
        } catch (IOException e) {
            System.out.println("❌ Problem in creating/writing file");
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("❌ Problem in closing file");
            }
        }
    }

    public void demo4() {
        File file = new File("files/test2/abc.txt");
        try (Writer writer = new FileWriter(file)) {
            writer.write("This is first hello word 😀😀😀");
        } catch (IOException e) {
            System.out.println("❌ Problem in creating/writing file");
        }
    }

    public void demo5() {
        File file = new File("files/test2/abc.txt");

        try (Reader reader = new FileReader(file)) {
            StringBuilder builder = new StringBuilder();

            // StringBuffer buffer  = new StringBuffer();
            // String str = "";

            while(true) {
                int ch = reader.read();
                if(ch == -1) break;
                // str += String.valueOf(ch); // new string object every time
                builder.append((char)ch);
            }
            System.out.println(builder.toString());
        } catch (IOException e) {
            System.out.println("❌ Problem in creating/writing file");
        }
    }

    public void demo6() {
        final File file = new File("files/test3/abc.txt");
        try(final OutputStream out = new FileOutputStream(file)) {
            String dt = "hello word, first operation 😀";
            out.write(dt.getBytes());
        }catch(IOException e) {
            System.out.println("❌ Trouble in working file");
        }
    }

    public void demo7() {
        final File file = new File("files/test3/abc.txt");
        try(final InputStream in = new FileInputStream(file)) {

            StringBuilder builder = new StringBuilder();

            while(true) {
                int ch = in.read();
                if(ch == -1) break;
                builder.append((char)ch);
            }
            System.out.println(builder.toString());
        }catch(IOException e) {
            System.out.println("❌ Trouble in working file");
        }
    }
    
}
