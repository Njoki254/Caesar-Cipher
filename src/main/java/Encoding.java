import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Encoding {

    public static String encode(String plainText, int shiftBy) {
        //for when user puts number greater than 26  or a negative number
        if (shiftBy > 26) {
            shiftBy = shiftBy % 26;
        } else if (shiftBy < 0) {
            shiftBy = (shiftBy % 26) + 26;
        }
       String encodedText = "";
        int length = plainText.length();
        for(int i= 0; i<length; i++){
            char ch = plainText.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch+shiftBy);
                    if()
                }
                else(Character.isUpperCase(ch)){

                }
            }
            else{
                encodedText += ch;
            }
        }
        return encodedText;

    }
}
