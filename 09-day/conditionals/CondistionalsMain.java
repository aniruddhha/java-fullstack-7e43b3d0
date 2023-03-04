import java.lang.invoke.CallSite;

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

    public void basicSwitchCase() {
        int day = 3;
        String dayName = "";

        switch(day) {
            case 1 : 
                dayName = "MON";
                break;
            case 2:
                dayName = "TUE";
                break;
            case 3: 
                dayName = "WED";
                break;
            case 4:
                dayName = "THU";
                break;
            case 5:
                dayName = "FRI";
                break;
            case 6:
                dayName = "SAT";
                break;
            case 7:
                dayName = "SUN";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }
        System.out.println(dayName);
    }
}

public class CondistionalsMain {

    public static void main(String[] args) {
        Conditionals cnd = new Conditionals();
        cnd.basicSwitchCase();
    }
}
