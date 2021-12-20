package Week11;

import java.util.Scanner;

public class WhileTrue_Keyboard {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);

         while (true) {
             System.out.println("Emter Number : ");
             int Number = kb.nextInt();
             

             if (Number==0) {
                break; 
             }
         }

    }
}
