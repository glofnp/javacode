package Week12;

import java.util.Scanner;

public class Factorial3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = kb.nextInt();
        int i = number;
        int result = 1;
        System.out.print(number + "! ==> ");
        while (i >= 1) {
            if (i == number) {
                System.out.print(i);
            } else {
                System.out.print("x" + i);
            }
            result = result * i;

            i--;

        
        System.out.println(" = " + result);

        if (number==0) {
            break;
        }
        
           System.out.print(number + "! ==> ");
            while (i >= 1) {

                if (i == number) {
                    System.out.print(i);

                } else {
                    System.out.print("x" + i);

                }

                result = result * i;

                i--;
            }
            System.out.println(" = " + result);
        }

    }
}