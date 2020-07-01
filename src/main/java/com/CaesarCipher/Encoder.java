package com.CaesarCipher;

import java.lang.*;

public class Encoder{

    private static char secretText;

//two parameters needed, plainText= code being encrypted, shiftby is the number
    public static void ValidateUserInput(String message, int shiftBy) {
//validation part of the code in case of - or # greater than 26, for unwanted user input
        if (shiftBy > 26) {
            shiftBy = shiftBy % 26;
        } else if (shiftBy < 0) {
            shiftBy = (shiftBy % 26) + 26;
        }
        String tester = "It's working";

    }
    public static void  calculateLength (String message){
        //the return value

        //.length gives the number of characters in a word, message in this case
        // integer created and called length and assigned value
        //get length to know how many times the shift method needs to loop through
        int length = message.length();


    }
    public static void shiftandEncodeCharacters(String message, int shiftBy ){
        int length = message.length();
        for(int i= 0; i<length; i++){
            char ch = message.charAt(i);
            //to check if character is letter
            if(Character.isLetter(ch)){
                //check if letter is upper or lower case, need integer value for each character from table ascii table each character assigned its own value
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch + shiftBy);
                    if(c>'z'){
                        secretText +=(char)(ch- (26 - shiftBy));
                    }
                    else{
                        secretText += c;
                    }
                }
                else if(Character.isUpperCase(ch)){
                    char c = (char)(ch + shiftBy);
                    if(c>'Z'){
                        secretText +=(char)(ch- (26 - shiftBy));
                    }
                    else{
                        secretText += c;
                    }

                }
            }
            else{
                secretText += 0;
            }
        }

        
    }

    public void main(String args){
        Encoder.ValidateUserInput();
        Encoder.calculateLength("It is working");
        Encoder.shiftandEncodeCharacters("It is working", 5);
        System.out.println(secretText);
        System.out.println("Now try having your own message ciphered");



    }

    private static void ValidateUserInput() {
    }

}

