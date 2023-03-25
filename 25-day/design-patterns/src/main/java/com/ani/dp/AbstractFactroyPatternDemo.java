package com.ani.dp;

public class AbstractFactroyPatternDemo {

    public static void main(String[] args) {
        AbstractFactory fact1 = new RedCircleFactory();
        Shape circle = fact1.createShape();
        circle.draw();
        Color red = fact1.createColor();
        red.fill();

        AbstractFactory fact2 = new BlueSquareFactory();
        Shape square = fact2.createShape();
        square.draw();
        Color blue = fact2.createColor();
        blue.fill();
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw()");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw()");
    }
}

interface Color {
    void fill();
}

class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill()");
    }
}

class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill()");
    }
}

interface AbstractFactory {
    Shape createShape();
    Color createColor();
}

class RedCircleFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
       return new Circle();
    }

    @Override
    public Color createColor() {
       return new Red();
    }
}

class BlueSquareFactory implements AbstractFactory {

    @Override
    public Shape createShape() {
        return new Square();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}