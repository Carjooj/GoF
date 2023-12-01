package gof.abstractfactory.factories;

import gof.abstractfactory.products.Button;
import gof.abstractfactory.products.Checkbox;
import gof.abstractfactory.products.WindowsButton;
import gof.abstractfactory.products.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
