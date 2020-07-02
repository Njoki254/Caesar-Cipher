package com.CaesarCipher;//In the future this is where the Front-End logic will go
import java.util.Scanner;

import static java.lang.System.out;


public class App {

    public void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean caesarcipherRunning = true;
        Encoder encoded = new Encoder();
        out.println("Welcome to this Cipher program, Enjoy");

        String chooseAction = myScanner.nextLine();


        int shiftBy = myScanner.nextInt();
        String cipherMessage = (encoded.shiftandEncodeCharacters("", 5));
        out.println("Below is your encoded message");
        out.println(cipherMessage);

        out.println("Enter the message you want to decrypt (must be the english alphabet)");
        String encodedMessage = myScanner.nextLine();
        out.println("enter the number you want the letters to be shifted by");
        Decoder decoded = new Decoder();
        String decodedMessage = decoded.shiftandDecodeCharacters("", 5);
        out.println("Below is the final decoded message");
        out.println(decodedMessage);
        out.println("Isn't it so cool? Adios! ");


    }
}





