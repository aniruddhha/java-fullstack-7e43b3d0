package con.ani.solutions.string;

public class LongestSubstring {

    public String longestSubString(String input) {

        String longestSubstring = "";
        String currentSubstring = "";

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            // System.out.print("" + currentChar +" , ");

            int indOfCurCh = currentSubstring.indexOf(currentChar);
            
            // System.out.println("Cur Char "+ currentChar +" Index " + indOfCurCh);
            
            if ( indOfCurCh == -1) { // linear
                currentSubstring += currentChar;
            } 
            else {
                if (currentSubstring.length() > longestSubstring.length()) { 
                    longestSubstring = currentSubstring;
                }
                int repeatIndex = currentSubstring.indexOf(currentChar); // linear
                System.out.println("Current - "+ currentSubstring);
                currentSubstring = currentSubstring.substring(repeatIndex + 1) + currentChar; //linear
                System.out.println("Index "+ repeatIndex +" -> " + currentSubstring);
            }
        }

        System.out.println();

        if (currentSubstring.length() > longestSubstring.length()) {
            longestSubstring = currentSubstring;
        }

        return longestSubstring;
    }

    public String longest(String input) {
        //dfehiejfd

        String longestString = "";

        for (int i = 0 ; i < input.length()-1 ; i++) {
            char curCh = input.charAt(i);

            String sub = input.substring(i+1);
            System.out.println("Cur CH -> "+curCh+" Sub -> "+ sub +" -> " + sub.contains(""+curCh) +" Long -> "+longestString);
            if(!sub.contains(""+curCh)) {
                if(sub.length() >= longestString.length())
                    longestString = curCh + sub;
            } else {
                if(longestString.contains(""+curCh)) {
                    int ind = longestString.indexOf("" + curCh);
                    longestString = longestString.substring(0, ind) + curCh;
                }
            }
        }
        return longestString;
    }   
}
