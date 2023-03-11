package com.ani.oop.inheritance;

//1. Single Inheritance
class Animal {   }
class Dog extends Animal {  }

//2. Multi Level Inheritance
class Mammal extends Animal {  }
class Tiger extends Mammal { }

//3. Hierarchical Inheritance
class Monkey extends Animal {  }
class Donkey extends Animal {  }

//4. Multiple inheritance (using interfaces)
interface Swimming { 
    void move();
}
interface Flying { 
    void move();
}
class Bird implements Swimming, Flying {
    @Override
    public void move() {
        
    }
}

interface Climbing extends Swimming, Flying { }

public class InheritanceDemo {
    public static void main(String[] args) {
        Flying fl = new Bird();
        fl.move();

        Swimming sm = new Bird();
        sm.move();
    }
}
