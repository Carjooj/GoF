package gof.factorymethod.factory;

import gof.factorymethod.buttons.Button;
import gof.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
    
}
