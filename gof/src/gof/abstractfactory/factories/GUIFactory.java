package gof.abstractfactory.factories;

import gof.abstractfactory.products.Button;
import gof.abstractfactory.products.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
