
abstract interface Gps {
    String VENDOR = "abc";

    public abstract int[] locate();
}

interface Light {
    double value();
}

interface AllExternals extends Gps, Light {

    default void detect() {
        System.out.println("static : Java 8 feature");
    }

    static void inspect() {
        System.out.println("static : Java 8 feature");
    }
}

@FunctionalInterface
interface OnlyOne {
    void onlyOne();
}

class Car implements Gps, Light {
    private int speed;
    
    public void increaseSpeed() {
        speed++;
    }

    @Override
    public int[] locate() {
        return new int[] { 18, 67 };
    }

    @Override
    public double value() {
      return 78.0;
    }
}
public class ItfcMain {
    public static void main(String[] args) {
        
    }
}
