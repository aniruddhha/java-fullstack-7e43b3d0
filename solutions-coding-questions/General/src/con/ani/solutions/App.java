package con.ani.solutions;

import con.ani.solutions.deviation.StandardDeviation;
import con.ani.solutions.string.LongestSubstring;

public class App {

    public static void typChk() {
        TypeChecker chk = new TypeChecker();
        chk.checkType(10); // it is int type
        chk.checkType("abc"); // it is string type
        // chk.checkType(new Car()); // it is car type
        // chk.checkType(new Animal()); // we are working on this
    }

    public static void standardDeviation() {

        double[] arr = { 23, 78.67, 90.23, 45.89, 23.12, 78, 90.34 };

        StandardDeviation sd = new StandardDeviation(arr);
        System.out.println("Standard Deviation " + sd.stdDv());
    }

    public static void longestSubString() {
        LongestSubstring ls = new LongestSubstring();
        // System.out.println("Longest " + ls.longestSubString("abcabbccbbr") );
        // ls.longestSubString("rarxbzatyrqw");
        System.out.println("Longest " + ls.longestSubString("rar") );
    }

    public static void enhancedFor() {

        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("👉 Normal For");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("👉 Enhanced For");
        for (int el : arr) {
            System.out.println(el);
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 General Solutions 🔥");
        longestSubString();
    }
}
