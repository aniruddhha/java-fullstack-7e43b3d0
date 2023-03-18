package con.ani.solutions.funifc;

public class ImageUploader {
    
    public void select() {
        new Thread( () -> { 
            try {
                Thread.sleep(5000);
                System.out.println("✅ Image Selection Completed ");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }).start();
    }

    public void compress() { 
        new Thread( () -> { 
            try {
                Thread.sleep(8000);
                System.out.println("✅ Image Compression Completed ");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        } ).start();
     }

    public void upload() { 
        new Thread( () -> { 
            try {
                Thread.sleep(3000);
                System.out.println("✅ Image Upload Completed ");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        } ).start();
    }
}
