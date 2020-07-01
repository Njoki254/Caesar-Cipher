import java.lang.*;

public class Encoder{
//two parameters needed, plainText= code being encrypted, shiftby is the number
    public String ValidateUserInput(String message, int shiftBy) {
//validation part of the code in case of - or # greater than 26, for unwanted user input
        if (shiftBy > 26) {
            shiftBy = shiftBy % 26;
        } else if (shiftBy < 0) {
            shiftBy = (shiftBy % 26) + 26;
        }
        String tester = "It's working";
        return tester;
    }
    public Integer calculateLength (String message){
        //the return value
        String secretText = "";
        //.length gives the number of characters in a word, message in this case
        // integer created and called length and assigned value
        //get length to know how many times the shift method needs to loop through
        int length = message.length();

        return length;
    }

}