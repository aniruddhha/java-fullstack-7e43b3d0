
// final abstract class Bottle { } // error

abstract class Animal {
    public abstract void walk();
}

class Monkey extends Animal {

    @Override
    public void walk() {
    }
}

public class AnimalMain {
    // public static void main(String[] args) {
    //     // Animal an = new Animal(); error

    //     Animal an = new Monkey();
    //     an.walk();
    // }
}
