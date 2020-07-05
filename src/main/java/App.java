import java.io.Console;
import java.util.Scanner;


import static java.lang.System.console;
import static java.lang.System.out;


public class App {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean caesarCipherRunning = true;
        Encoder encodeMessage = new Encoder();
        //when you create instance has acess to all public methods
        Decoder decodeMessage = new Decoder();



        String userInput = "";
        String userAction = "";

        while (true){

            System.out.println("Welcome to this Cipher program, Choose to Encode or decode or exit");
            //create variable to hold the user input
            userAction = myScanner.nextLine();

            if (userAction.equals("exit"))
                System.out.println("I hoper you had a great experience. See yah later!")
                break;

                System.out.println("Enter the message: ");
            //create variable to hold the user input
            userInput = myScanner.nextLine();

            if (userAction.equalsIgnoreCase("decode")){
                // pass the msg variable as a parameter to
                decodeMessage.setMessage(userInput);
                System.out.println("Enter the number you want words to be shifted by");
                String shiftNumber = myScanner.nextLine();
                int intNumber = Integer.parseInt(shiftNumber);
                decodeMessage.setShiftyBy(intNumber);
                String dcd = decodeMessage.run();
                System.out.println(dcd);
            }
            else if (userInput.equalsIgnoreCase("encode")){
                encodeMessage.setMessage(userInput);
                System.out.println("Enter the number you want words to be shifted by");
                String shiftNumber = myScanner.nextLine();
                int intNumber = Integer.parseInt(shiftNumber);
                encodeMessage.setShiftyBy(intNumber);
                String ecd = encodeMessage.run();
                System.out.println(ecd);


            }


        }



    }


}








