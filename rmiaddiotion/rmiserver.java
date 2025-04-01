import java.rmi.Naming;
import java.rmi.RemoteException;

public class rmiserver {

    public static void main(String[] args) {
        try {
            // Create an instance of the remote object
            two twox = new two();

            // Bind the object to the RMI registry
            Naming.bind("rmi://localhost/ad", twox);
            Naming.bind("rmi://localhost/sub", twox);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server exception: " + e);
        }
    }
}
