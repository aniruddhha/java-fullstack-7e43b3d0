package com.ani.dp;

public class FactoryMethodPatternDemo { 

    public static void main(String[] args) {
        
        SimpleVehicleFacory factory = new SimpleVehicleFacory();

        Discountable bike = factory.createDicountedVehicle("bike");
        bike.giveDiscount(10);

        Discountable cycle = factory.createDicountedVehicle("cycle");
        cycle.giveDiscount(80);

        ComplexVehicleFacoryCreator fact1 = new BikeCreatorFactory();
        Discountable bk = fact1.createDicountedVehicle();
        bk.giveDiscount(67);
    }
}

interface Discountable {
    void giveDiscount(double amt);
}

class Cycle implements Discountable {
    @Override
    public void giveDiscount(double amt) {
        System.out.println("Discount on Cycle "+ amt);
    }
}

class Bike implements Discountable {
    @Override
    public void giveDiscount(double amt) {
        System.out.println("Discount on Bike "+ amt);
    }
}

class SimpleVehicleFacory { // simple one
    public Discountable createDicountedVehicle(String type) {

        if(type.equalsIgnoreCase("cycle")) {
            return new Cycle();
        }
        else if(type.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        throw new IllegalArgumentException("Given Type is not supperted");
    }
}

interface ComplexVehicleFacoryCreator {
    Discountable createDicountedVehicle();
}

class BikeCreatorFactory implements ComplexVehicleFacoryCreator {
    @Override
    public Discountable createDicountedVehicle() {
        return new Bike();
    }
}

class CycleCreatorFactory implements ComplexVehicleFacoryCreator {
    @Override
    public Discountable createDicountedVehicle() {
        return new Cycle();
    }
}