package com.ani.file.ops;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

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
   
    public void demo8() {
        Long id = 10L;
        String name = "abc";
        Boolean isEmp = true;
        Double sal = 78.90d;

        final File file = new File("files/test4/abc.dat");
        try(
            final FileOutputStream fos = new FileOutputStream(file);
            final DataOutputStream dos = new DataOutputStream(fos)
        ) {
            dos.writeLong(id);
            dos.writeUTF(name);
            dos.writeBoolean(isEmp);
            dos.writeDouble(sal);
        } catch(IOException e) {
            System.out.println("❌ Unable to write the data");
        }
    }

    public void demo9() {
        final File file = new File("files/test4/abc.dat");
        try (
            final FileInputStream fis = new FileInputStream(file);
            final DataInputStream dis = new DataInputStream(fis);
        ) {
           Long id = dis.readLong();
           String name = dis.readUTF();
           boolean isEmp = dis.readBoolean();
           double sal = dis.readDouble();
           System.out.println("👉 Id "+ id);
           System.out.println("👉 Name "+ name);
           System.out.println("👉 Is Emp "+ isEmp);
           System.out.println("👉 Salary "+ sal);
        } catch (IOException e) {
            System.out.println("❌ Unable to read the data");
        }
    }

    public void demo10() {
        final Car car = new Car(10, "abc", false);

        final File file = new File("files/test5/car.dat");

        try( 
            final FileOutputStream fos = new FileOutputStream(file);
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
        ){ 
            oos.writeObject(car);
         }
        catch(IOException e) {
            // e.printStackTrace();
            System.out.println("❌ Problem in writing file");
        }
    }

    public void demo11() {
        final File file = new File("files/test5/car.dat");

        try( 
            final FileInputStream fis = new FileInputStream(file);
            final ObjectInputStream ois = new ObjectInputStream(fis);
        ){ 
           Car car = (Car)ois.readObject();
           System.out.println("✅ Data Read");
           System.out.println(car);
         }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("❌ Problem in writing file");
        }
    }

    public void demo12() {

        final File file = new File("files/test6/abc.txt");

        try (
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            bw.write("Hello Word Using Buffering");
        } catch (IOException e) {
            System.out.println("❌ Something Bad Happened "+ e.getMessage());
        }
    }

    public void demo13() {
        final File file = new File("files/test6/abc.txt");
        
        try(
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
        ) {
            StringBuilder sb = new StringBuilder();

            while(true) {
                int ch = br.read();
                if(ch == -1) break;
                sb.append((char)ch);
            }
            System.out.println(sb.toString());
        }
        catch (IOException e) {
            System.out.println("❌ Something Bad Happened "+ e.getMessage());
        }
    }

    public void demo14() {

        final File file = new File("files/test7/abc.txt");
        try(
            final OutputStream out = new FileOutputStream(file);
            final BufferedOutputStream bos = new BufferedOutputStream(out)
        ) {
            String dt = "hello word, first operation 😀";
            bos.write(dt.getBytes());
        }catch(IOException e) {
            System.out.println("❌ Trouble in working file "+e.getMessage());
        }
    }

    public void demo15() {
        final File file = new File("files/test7/abc.txt");
        try(
            final InputStream in = new FileInputStream(file);
            final BufferedInputStream bis = new BufferedInputStream(in);
        ) {
            final StringBuilder builder = new StringBuilder();

            while(true) {
                int ch = bis.read();
                if(ch == -1) break;
                builder.append((char)ch);
            }
            System.out.println(builder.toString());
        }catch(IOException e) {
            System.out.println("❌ Trouble in working file " + e.getMessage());
        }
    }
}
