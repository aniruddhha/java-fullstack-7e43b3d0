import java.util.Arrays;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;

class Dtl {
    
    private int min;
    private int max;
    private int nth;

    public Dtl(int min, int max, int nth) {
        this.min = min;
        this.max = max;
        this.nth = nth;
    }

    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getNth() {
        return nth;
    }
    public void setNth(int nth) {
        this.nth = nth;
    } 

    
}

class MinMax {

    public Dtl findMinMax(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for( int i = 0; i < arr.length; i++ ) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        return new Dtl(min, max, 0);
    }

    public Dtl nthMinMax(int[] arr, int n) {
        int[] sortedArr = arr;
        Arrays.sort(sortedArr);

        return new Dtl(
            sortedArr[n - 1], 
            sortedArr[sortedArr.length - n], 
            n
        );
    }
}

public class MinMaxMain {
    public static void main(String[] args) {
        MinMax mm = new MinMax();
        Dtl dt1 = mm.findMinMax(new int[] { 1, 3, 1, 78, 67, 23, 56, 90, 2, 45 } );   
        System.out.println("Max number is "+dt1.getMax());
        System.out.println("Min number is "+dt1.getMin());

        Dtl dtl2 = mm.nthMinMax(new int[] { 1, 3, 1, 78, 67, 23, 56, 90, 2, 45 }, 3);
        System.out.println("" + dtl2.getNth() +" Minimum " + dtl2.getMin() );
        System.out.println("" + dtl2.getNth() +" Maximum " + dtl2.getMax() );
    }   
}
