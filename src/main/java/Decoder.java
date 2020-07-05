import java.lang.*;

public class Decoder {

    static String exmp = "nlvlclldld";
    private String message = "";
    private int shiftyBy;
    private String decryptText = "";

    //two parameters needed, plainText= code being encrypted, shiftby is the number
    public String ValidateUserInput(int shiftBy) {
//validation part of the code in case of - or # greater than 26, for unwanted user input
        if (shiftBy > 26) {
            shiftBy = shiftBy % 26;
        } else if (shiftBy < 0) {
            shiftBy = (shiftBy % 26) + 26;
        }
        String tester = "It's working";
        return tester;
    }

    public Integer calculateLength(String message) {
        //the return value

        //.length gives the number of characters in a word, message in this case
        // integer created and called length and assigned value
        //get length to know how many times the shift method needs to loop through
        int length = message.length();

        return length;
    }

    public String shiftandDecodeCharacters(String message, int shiftBy) {
        int length = calculateLength(message);
        for (int i = 0; i < length; i++) {
            char ch = message.charAt(i);
            //to check if character is letter
            if (Character.isLetter(ch)) {
                //check if letter is upper or lower case, need integer value for each character from table ascii table each character assigned its own value
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch - shiftBy);
                    if (c < 'a') {
                        decryptText += (char) (ch + (26 - shiftBy));
                    } else {
                        decryptText += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch - shiftBy);
                    if (c < 'A') {
                        decryptText += (char) (ch + (26 - shiftBy));
                    } else {
                        decryptText += c;
                    }

                }
            } else {
                decryptText += 0;
            }
        }

        return decryptText;
    }

    public void setMessage(String message) {
        //take class variable and equate it to parameter/user input
        this.message = message;
    }

    public void setShiftyBy(int shiftyBy) {
        this.shiftyBy = shiftyBy;
    }

    public int getShiftBy() {
        return shiftyBy;
    }

    public String getMessage() {
        return message;
    }

    public String run(){
        String decryptedText = shiftandDecodeCharacters(getMessage(),getShiftBy());
        return decryptedText;

    }
}