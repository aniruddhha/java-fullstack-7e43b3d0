

class Dt {
    private int a;
    private int b;

    public Dt(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
class Swap {
    public Dt doSwap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        return new Dt(a, b);
    }    
}

public class SwapMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Swap sp = new Swap();
        System.out.println("Before a "+ a + " b " + b);
        Dt swapped = sp.doSwap(a, b);
        System.out.println("After a "+ swapped.getA() + " b " + swapped.getB());

    }
}
