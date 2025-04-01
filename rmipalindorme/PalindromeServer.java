import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class PalindromeServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // Start RMI registry
            PalindromeImpl palindromeService = new PalindromeImpl();
            Naming.rebind("rmi://localhost/PalindromeService", palindromeService);
            System.out.println("Palindrome RMI Server is running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.getMessage());
        }
    }
}
