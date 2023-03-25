package com.ani.dp;

public class PrototypePattern {
    public static void main(String[] args) {
        ConcretePrototype prt = new ConcretePrototype("pqr");
        ConcretePrototype cpy = (ConcretePrototype) prt.clone();
        cpy.setName("copied abc");
        System.out.println("Proto " + prt.getName());
        System.out.println("Copy " + cpy.getName());
    }
}

interface Prototype {
    Prototype clone();
}

class ConcretePrototype implements Prototype {

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(name);
    }
}
