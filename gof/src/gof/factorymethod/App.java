package gof.factorymethod;

import gof.factorymethod.factory.Dialog;
import gof.factorymethod.factory.HtmlDialog;
import gof.factorymethod.factory.WindowsDialog;

public class App {

    private static Dialog dialog;
    public static void main(String[] args) throws Exception {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Linux")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
