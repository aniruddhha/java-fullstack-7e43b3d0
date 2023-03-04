
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
}

public class LoopsMain {
    public static void main(String[] args) {
        Loops lp = new Loops();
        // lp.basicFor();
        // lp.basicWhile();
        lp.basicDoWhile();
    }
}
