

class Pyramids {
    public void leftPyramid() {
        //complete the code
    }

    public void centerPyramid(int rows) { // o(1)
        for (int i = 1; i <= rows; i++) { //o(n)
            int spaces = rows - i; // o(1)
            int stars = 2 * i - 1; // o(1)
            for (int j = 1; j <= spaces; j++) { //o(1)
                System.out.print(" "); // o(1)
            }
            for (int k = 1; k <= stars; k++) { // o(1)
                System.out.print("*"); // o(1)
            }
            System.out.println(); // o(1)
        }
    }
    public void rightPyramid() {
        // complete the code
    }
}

public class PyramidMain {
   public static void main(String[] args) {
    Pyramids pyramids = new Pyramids();
    pyramids.centerPyramid(5);
   }
}
