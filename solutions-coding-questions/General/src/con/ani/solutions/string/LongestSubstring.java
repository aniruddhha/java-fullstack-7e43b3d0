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
}
