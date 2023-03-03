
class Calculator {

    int calc(int a, int b) {
        return a + b;
    }

    double calc(double a, double b) {
        return a + b;
    }
}


class Shape {
    double area() {
        System.out.println("In Shape Class");
        return 10;
    }
}

class Circle extends Shape {
    private int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    public double area() {
        System.out.println("In Circle Class");
        return rad * rad * 3.14;
    }

    public double pi() {
        return 3.14;
    }
}

public class PolymorphismMain {
    public static void main(String[] args) {
        
        Calculator cl = new Calculator();
        cl.calc(145.5, 56.4);
        cl.calc(12, 23);

        Shape sh = new Shape();
        sh.area(); // In Shape

        Circle cr = new Circle(15);
        cr.area(); // In Circle

        Shape sh1 = new Circle(89);
        sh1.area(); // In Shape/Circle
        // sh1.pi();

        // Circle cr1 = new Shape(); error
        //cr1.area() //
    }
}
