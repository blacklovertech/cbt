import org.omg.CORBA.*;

public class HelloImpl extends _HelloStub {
    public String sayHello() {
        return "Hello from CORBA!";
    }
}
