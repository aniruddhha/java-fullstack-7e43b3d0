
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    @Override
    double area() {
        return rad * rad * 3.14;
    }
}

public class AbstractionMain  {
    public static void main(String[] args) {
        
        Shape sh = new Circle(5);
        sh.area();
    }
}