package gof.abstractfactory;

import gof.abstractfactory.factories.GUIFactory;
import gof.abstractfactory.products.Button;
import gof.abstractfactory.products.Checkbox;

public class Client {

    private Button button;
    private Checkbox checkbox;

    public Client(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
