import org.omg.CORBA.*;

public interface Hello extends HelloOperations, Object, IDLEntity {
}

interface HelloOperations {
    String sayHello();
}
