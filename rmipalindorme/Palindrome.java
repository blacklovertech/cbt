import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Palindrome extends Remote {
    boolean isPalindrome(String str) throws RemoteException;
}
