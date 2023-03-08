public class App {
    public static void main(String[] args) throws Exception {
        // I want to store 10 integers

        int[] numsDyn = new int[5]; // static array initilization
        numsDyn[0] = 100;
        numsDyn[1] = 34;
        numsDyn[2] = 1;
        numsDyn[3] = 2;
        numsDyn[4] = 20;
        // numsDyn[5] = 89; // array index out of bound

        System.out.println("Read 2nd " + numsDyn[1]);

        int[] numsStc = { 1, 78, 90, 34, 67 };
        System.out.println("Read 2nd " + numsStc[1]);
        numsStc[5] = 12;

        for (int i = 0; i < numsDyn.length; i++ ) {
            int el = numsDyn[i];
            System.out.println("Element is "+ el);
        }

        for (int el : numsDyn) {
            System.out.println("Element is "+ el);
        }
    }
}
