import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PalindromeImpl extends UnicastRemoteObject implements Palindrome {

    protected PalindromeImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean isPalindrome(String str) throws RemoteException {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
