package con.ani.solutions;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        TypeChecker chk = new TypeChecker();
        chk.checkType(10); // it is int type
        chk.checkType("abc"); // it is string type
        chk.checkType(new Car()); // it is car type
        chk.checkType(new Animal()); // we are working on this
    }
}
