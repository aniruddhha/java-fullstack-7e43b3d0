package con.ani.solutions.deviation;

public class StandardDeviation {
    
    private double[] arr;
    private double mean;
    private double sd = 0;
    int i;

    public StandardDeviation(double[] arr) {
        if(arr == null) {
            throw new RuntimeException("");
        }
        this.arr = arr;

        i = cal();
        i = 0;
        
        mean = mn();
    }

    private int cal() {
        return 0;
    }

    private double mn() {
        return totalSum() / n();
    }

    private double n() {
        return arr.length;
    }

    private double totalSum() {
        double sm = 0;

        for(double el : arr) {
            sm += el;
        }

        return sm;
    }

    public double stdDv() {
        
        double sqr = 0;

        for (double el : arr) {
            sqr += Math.pow((el - mean), 2);
        }

        return sd = Math.sqrt(sqr/n());
    }
}
