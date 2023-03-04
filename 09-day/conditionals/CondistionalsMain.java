class Conditionals {

    public void basicIf() {
        int a = 10;

        if (a > 10) {
            System.out.println("Its true");
        }
    }

    public void ifElse() {
        int a = 10;

        if (a > 10) {
            System.out.println("Its true");
        } else {
            System.out.println("Its Not true");
        }
    }

    public void ifElseLadder() {
        int marks = 60;

        if (marks >= 90) {
            System.out.println("Distinction");
        } else if (marks < 90 && marks >= 78) {
            System.out.println("First Class");
        } else if (marks < 78 && marks >= 55) {
            System.out.println("Second Class");
        }else {
            System.out.println("They Can be Entrepreneur");
        }
    }

    public void nestedIf() {
        int threshold = 60;

        if(threshold < 60) {    
            int current = 8;
            if(current < 10) {
                System.out.println("Good");
            }else {
                System.out.println("Stopping Motor");
            }

        } else {
            System.out.println("Too High Vibrations");
        }
    }
}

public class CondistionalsMain {

    public static void main(String[] args) {
        Conditionals cnd = new Conditionals();
        cnd.basicIf();
        cnd.ifElse();
        cnd.ifElseLadder();
        cnd.nestedIf();
    }
}
