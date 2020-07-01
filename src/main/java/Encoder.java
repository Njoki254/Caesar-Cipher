import java.lang.*;

public class Encoder{
//two parameters needed, plainText= code being encrypted, shiftby is the number
    public String EncodeMessage(String message, int shiftBy) {
//validation part of the code in case of - or # greater than 26, for unwanted user input
        if (shiftBy > 26) {
            shiftBy = shiftBy % 26;
        } else if (shiftBy < 0) {
            shiftBy = (shiftBy % 26) + 26;
        }
        String tester = "It's working";
        return tester;
    }
}