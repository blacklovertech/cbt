import java.rmi.Naming;
import java.util.Scanner;

public class PalindromeClient {
    public static void main(String[] args) {
        try {
            Palindrome palindromeService = (Palindrome) Naming.lookup("rmi://localhost/PalindromeService");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (palindromeService.isPalindrome(input)) {
                System.out.println("The given string is a palindrome.");
            } else {
                System.out.println("The given string is not a palindrome.");
            }

            scanner.close();
        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
        }
    }
}
