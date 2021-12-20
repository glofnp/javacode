package Week07;
import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = kb.nextLine();
        System.out.print("Enter password : ");
        String password = kb.nextLine();

        if (username == "admin" && password == "12345") {
         System.out.println("You're logged in.");
        } else {
         System.out.println("Sorry, username or password is incorrect.");
        }
    }
}