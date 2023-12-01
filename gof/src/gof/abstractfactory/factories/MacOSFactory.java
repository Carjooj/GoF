package gof.abstractfactory.factories;

import gof.abstractfactory.products.Button;
import gof.abstractfactory.products.Checkbox;
import gof.abstractfactory.products.MacOSButton;
import gof.abstractfactory.products.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
