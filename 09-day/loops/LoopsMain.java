
class Loops {
    public void basicFor() {
        for(int i = 0; i < 10; i++ ) {
            System.out.println(i);
        }
    }
    
    public void basicWhile() {
        int i = 0;
        while(true) { // odd loops
            if(i > 10) break;
            else {
                i++;
                System.out.println(i);
                continue; 
            }
            // if you dont write continue still it okay
            // just for explaining, i have written
        }
    }

    public void basicDoWhile() {
        int i = 0;

        do {
            if(i > 10) break;
            i++;
            System.out.println(i);
        }while(i < 10);
    }

    public void nestedFor() {
        for (int i = 0; i < 3; i++) {
            // each statement will execute 3 times
            for(int j = 0; j < 2; j++) {
                // each statement will execute 2 times
                System.out.println("i = "+i +" j = " +j);
            }
            // this for will execute for each iteration of i
        }
    }

    public void setWaterSensor(int val) {

    }
    
    public void nestedWhile() {
        boolean isRPMThreshold = true;
        int ltr = 70;

        while(isRPMThreshold) {

            while(ltr < 100) {
                // check water level by sensor value
                ltr = 56;
            }

            do {
                // set water level sensor
                setWaterSensor(89);
            } while(true);
        }
    }
}

public class LoopsMain {
    public static void main(String[] args) {
        Loops lp = new Loops();
        lp.nestedFor();
    }
}
