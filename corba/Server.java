import org.omg.CORBA.*;
import org.omg.PortableServer.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Initialize ORB
            ORB orb = ORB.init(args, null);

            // Get root POA and activate POA Manager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            // Create and register HelloImpl object
            HelloImpl helloImpl = new HelloImpl();
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);
            
            // Print IOR (Object Reference)
            String ior = orb.object_to_string(ref);
            System.out.println("Server IOR: " + ior);

            // Keep Server Running
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
