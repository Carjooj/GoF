package gof.factorymethod.factory;

import gof.factorymethod.buttons.Button;
import gof.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
}
