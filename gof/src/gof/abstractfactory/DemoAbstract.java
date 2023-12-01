package gof.abstractfactory;

import gof.abstractfactory.factories.GUIFactory;
import gof.abstractfactory.factories.MacOSFactory;
import gof.abstractfactory.factories.WindowsFactory;

public class DemoAbstract {

    private static Client configureClient(String os) {
        Client client;
        GUIFactory factory;

        String osName = os.toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        client = new Client(factory);
        return client;
    }

    public static void main(String[] args) {
        Client client = configureClient("windows");
        client.paint();
    }
    
}
