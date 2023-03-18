package con.ani.solutions.funifc;

public class ImageUploader {

    public void select(CompletionCallback cb) {
        new Thread(() -> {
            simulateProcessingTime(5);
            // System.out.println("✅ Image Selection Completed ");
            cb.complete("selection");
        }).start();
    }

    public void compress(CompletionCallback cb) {
        new Thread(() -> {
            simulateProcessingTime(8);
            // System.out.println("✅ Image Compression Completed ");
            cb.complete("compress");
        }).start();
    }

    public void upload(CompletionCallback cb) {
        new Thread(() -> {
            simulateProcessingTime(3);
            
            cb.complete("upload");
            // System.out.println("✅ Image Upload Completed ");
        }).start();
    }

    private void simulateProcessingTime(long s) {
        try {
            Thread.sleep(s*1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
