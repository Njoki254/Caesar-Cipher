package com.CaesarCipher;

public class CaesarCipher {
    public class Encoder {

        String secretText = "";

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

        public Integer calculateLength(String message) {
            //the return value

            //.length gives the number of characters in a word, message in this case
            // integer created and called length and assigned value
            //get length to know how many times the shift method needs to loop through
            int length = message.length();

            return length;
        }

        public String shiftandEncodeCharacters(String message, int shiftBy) {
            int length = message.length();
            for (int i = 0; i < length; i++) {
                char ch = message.charAt(i);
                //to check if character is letter
                if (Character.isLetter(ch)) {
                    //check if letter is upper or lower case, need integer value for each character from table ascii table each character assigned its own value
                    if (Character.isLowerCase(ch)) {
                        char c = (char) (ch + shiftBy);
                        if (c > 'z') {
                            secretText += (char) (ch - (26 - shiftBy));
                        } else {
                            secretText += c;
                        }
                    } else if (Character.isUpperCase(ch)) {
                        char c = (char) (ch + shiftBy);
                        if (c > 'Z') {
                            secretText += (char) (ch - (26 - shiftBy));
                        } else {
                            secretText += c;
                        }

                    }
                } else {
                    secretText += 0;
                }
            }

            return secretText;
        }

        public void main(String args) {


        }

    }

    public class Decoder {


        String secretText = "";


        Encoder encrypt = new Encoder();

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

        public Integer calculateLength(String message) {
            //the return value

            //.length gives the number of characters in a word, message in this case
            // integer created and called length and assigned value
            //get length to know how many times the shift method needs to loop through
            int length = message.length();

            return length;
        }

        public String shiftandDecodeCharacters(String message, int shiftBy) {
            int length = message.length();
            for (int i = 0; i < length; i++) {
                char ch = message.charAt(i);
                //to check if character is letter
                if (Character.isLetter(ch)) {
                    //check if letter is upper or lower case, need integer value for each character from table ascii table each character assigned its own value
                    if (Character.isLowerCase(ch)) {
                        char c = (char) (ch - shiftBy);
                        if (c < 'a') {
                            secretText += (char) (ch + (26 - shiftBy));
                        } else {
                            secretText += c;
                        }
                    } else if (Character.isUpperCase(ch)) {
                        char c = (char) (ch - shiftBy);
                        if (c < 'A') {
                            secretText += (char) (ch + (26 - shiftBy));
                        } else {
                            secretText += c;
                        }

                    }
                } else {
                    secretText += 0;
                }
            }

            return secretText;
        }

        public void main(String[] args) {
            String text = "This is a message";
            String theSecret = shiftandDecodeCharacters(text, 6);
            System.out.println(theSecret);
            String decoded = shiftandDecodeCharacters(theSecret, 5);
            System.out.println(decoded);


        }


    }
}