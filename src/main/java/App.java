import java.io.Console;


import static java.lang.System.console;
import static java.lang.System.out;


public class App {

    public static void main(String[] args) {
        Console myConsole = System.console();
        boolean caesarCipherRunning = true;
        Encoder encodeMessage = new Encoder();
        Decoder decodeMessage = new Decoder();


        System.out.println("Welcome to this Cipher program, Choose to Encode or decode");


        System.out.println("Enter the message you want to encode: ");
        myConsole.readLine();
        System.out.println("Enter the number you want words to be shifted by");
        String shiftNumber = myConsole.readLine();
        int intNumber = Integer.parseInt(shiftNumber);



        System.out.println("Here is your encrypted story:");



    }


}









