package con.ani.solutions;

import con.ani.solutions.collections.CharacterCount;
import con.ani.solutions.collections.CommonUnique;
import con.ani.solutions.deviation.StandardDeviation;
import con.ani.solutions.string.LongestSubstring;
import con.ani.solutions.string.RemChar;
import con.ani.solutions.string.RotationEqaulity;

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
        // hiejfd
        // System.out.println("Longest " + ls.longestSubString("dfehiejfd") );
        // ls.longest("dfehiejfd");
        // ls.longest("dfehiejfd");
        // System.out.println("Longest " + ls.longest("dfehiejfd")); // hiejfd
        // System.out.println("Longest " + ls.longest("abcc")); // abc
        System.out.println("Longest " + ls.longestSubString("abcabcrxytab") );
        // System.out.println("Longest " + ls.longest("abcabbccbbr") );
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

    public static void rotationEquality() {

        RotationEqaulity roEq = new RotationEqaulity();

        String sts1 = roEq.isRotationEqual("abc", "bbc") ? "bbc is rotation of abc" : "bbc is not a roatation of abc";
        System.out.println(sts1);

        String sts2 = roEq.isRotationEqual("aa", "aa") ? "aa is rotation of aa" : "aa is not a roatation of aa";
        System.out.println(sts2);

        String sts3 = roEq.isRotationEqual("a", "b") ? "b is rotation of a" : "b is not a roatation of a";
        System.out.println(sts3);

        String sts4 = roEq.isRotationEqual("a", "a") ? "a is rotation of a" : "a is not a roatation of a";
        System.out.println(sts4);

        String sts5 = roEq.isRotationEqual("abcpqr", "rqpcba") ? "rqpcba is rotation of abcpqr" : "rqpcba is not a roatation of abcpqr";
        System.out.println(sts5);
    }

    public static void remChar() {

        RemChar rc = new RemChar();
        
        System.out.println("Answer (abcpqr)"+ rc.remChar("abcxpqr", "x"));
        System.out.println("There is no x in string"+ rc.remChar("abcpqr", "x"));
        System.out.println("Invalid Strinf"+ rc.remChar("", "x"));
        System.out.println("Specify the character to be removed"+ rc.remChar("abcxpqr", ""));
        System.out.println("Answer (ab) "+ rc.remChar("axb", "x"));
        System.out.println("Answer (nothing remains) "+ rc.remChar("x", "x"));
        System.out.println("Answer (x) "+ rc.remChar("xx", "x"));
        System.out.println("Answer (abcpqr)"+ rc.remChar("axbcxpqr", "x"));
    }
    
    public static void countChars() {
        CharacterCount cc = new CharacterCount();
        String op1 = cc.countChars("aaatttaeee");
        String sts1 = op1.equals("a4,t3,e3") ? "✅ Correct " : "❌ Wrong";
        System.out.println(sts1);

        String op2 = cc.countChars("qwqwwwqw");
        String sts2 = op2.equals("q3,w5") ? "✅ Correct " : "❌ Wrong";
        System.out.println(sts2);
    }

    public static void uniqueCommon() {
        CommonUnique cu = new CommonUnique();

        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {4, 5, 6, 7, 8};

        ;
        System.out.println(cu.unique(arr1, arr2));
        System.out.println(cu.common(arr1, arr2));
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 General Solutions 🔥");
    //    rotationEquality();
    // longestSubString();
        // countChars();
        uniqueCommon();   
    }
}
