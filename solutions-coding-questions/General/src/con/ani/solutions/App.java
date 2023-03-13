package con.ani.solutions;

import con.ani.solutions.deviation.StandardDeviation;

public class App {

    public static void typChk() {
        TypeChecker chk = new TypeChecker();
        chk.checkType(10); // it is int type
        chk.checkType("abc"); // it is string type
        // chk.checkType(new Car()); // it is car type
        // chk.checkType(new Animal()); // we are working on this
    }

    public static void standardDeviation() {

        double[] arr = { 23,78.67, 90.23, 45.89, 23.12, 78, 90.34 };

        StandardDeviation sd = new StandardDeviation(arr);
        System.out.println("Standard Deviation " + sd.stdDv());
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 General Solutions 🔥");

        standardDeviation();
    }
}
