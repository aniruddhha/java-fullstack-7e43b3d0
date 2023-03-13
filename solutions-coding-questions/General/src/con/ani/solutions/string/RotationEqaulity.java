package con.ani.solutions.string;

public class RotationEqaulity {
    
    public boolean isRotationEqual(String one, String two) {
        String rev = reverse(two);
        return one.equals(rev);
    }

    private String reverse(String str) {
        String st = "";

        for (int i = str.length()-1; i >= 0; i--) {
            st += str.charAt(i);
        }

        return st;
    }
}
