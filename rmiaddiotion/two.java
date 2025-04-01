import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class two extends UnicastRemoteObject implements one {

    // Constructor
    public two() throws RemoteException {}

    // Implementing the add method
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    // Implementing the sub method
    @Override
    public int sub(int a, int b) throws RemoteException {
        return a - b;
    }
}
