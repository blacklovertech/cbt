import java.rmi.Naming;

public class rmiclient {

    public static void main(String[] args) {
        try {
            // Lookup the remote object for addition
            one addObj = (one) Naming.lookup("rmi://localhost/ad");

            // Lookup the remote object for subtraction
            one subObj = (one) Naming.lookup("rmi://localhost/sub");

            // Call the remote methods and display the results
            System.out.println("Addition: " + addObj.add(40, 30));
            System.out.println("Subtraction: " + subObj.sub(40, 30));
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}
