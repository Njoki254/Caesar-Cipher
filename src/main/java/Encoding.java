public class Encoding {

    public static String encode(String plainText, int shift) {
        //for when user puts number greater than 26  or a negative number
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
       String encodedText = "";
        int length = plainText.length();
        for(int i= 0; i<length; i++){
            char ch = plainText.charAt(i);
            if(Character.isLetter(ch)){
        }
        return encodedText;

    }
}
