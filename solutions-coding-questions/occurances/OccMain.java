
class Occ {
    // improvise it for the numbers greater than 10
    public void findOccurances(int[] arr) {
        //[1, 4, 6, 7, 1, 4 , 6]

        int[] counts = new int[10]; // o(1)

        // [0, 1, 0, 1, 0, 0, 0, 0, 0 ,0]
        for (int num : arr) { // o(n)
            counts[num]++;
        }

        for (int i = 0; i < counts.length; i++) { // o(n)
            if(counts[i] > 0) { // o(1)
                System.out.println("" + i +" is repeated " + counts[i] + " times ");
            }
        }
    }
    // o(n) + o(n) = 2o(n) = o(2n) = o(n)

public class OccMain {
    public static void main(String[] args) {

        Occ oc = new Occ();
        oc.findOccurances(new int[] { 1, 4, 6, 7, 1, 4, 6 });
    }
}
