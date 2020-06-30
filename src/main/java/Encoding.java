import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Encoding {

    private static final int AlphabetSize = 26;

    public String encoding(String plainText, int shiftBy) {
        // rotate by only the size of the alphabet:
        shiftBy %= AlphabetSize;
        char[] chars = message.toCharArray();
        rotate(chars, shiftBy);
        return new String(chars);
    }

}
