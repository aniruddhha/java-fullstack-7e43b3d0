
class StaticDemo {
    int num = 0;
    static int cnt = 0;

    static {
        System.out.println("One");
        cnt = 0;
    }
    static {
        System.out.println("Two");
    }

    public static void showCount() {
        System.out.println("Cnt is "+cnt);
    }

    public void showNum() {
        num = 10; // ✅ ✅ ✅ ❌ ❌
        cnt  = 90; // ❌ ❌ ✅ ❌ ❌
    }
}

public class StaticMain {

    void doMain() {
        main(null);
        StaticMain.main(null);
    }

    public static void main(String[] args) {

        StaticDemo.cnt++;

        StaticDemo sd1 = new StaticDemo();
        sd1.num++; //1
        sd1.cnt++; //1
       
        System.out.println("Num "+ sd1.num);
        System.out.println("Cnt "+ sd1.cnt);

        StaticDemo sd2 = new StaticDemo();
        sd2.num++; //1
        sd2.cnt++; //1
        System.out.println("Num "+ sd2.num);
        System.out.println("Cnt "+ sd2.cnt);

        StaticDemo sd3 = new StaticDemo();
        sd3.num++; // 1
        sd3.cnt++; // 1
        System.out.println("Num "+ sd3.num);
        System.out.println("Cnt "+ sd3.cnt);
    }
}
