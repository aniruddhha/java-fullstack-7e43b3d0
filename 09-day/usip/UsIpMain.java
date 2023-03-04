import java.util.Scanner;

public class UsIpMain {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("👉 Enter Your Age :  ");
        int age = scanner.nextInt();
        System.out.println("✅ Age "+ age);

        System.out.println("👉 Enter Your Salary :  ");
        double sal = scanner.nextDouble();
        System.out.println("✅ Salary "+ sal);

        scanner.close();

    }
}
