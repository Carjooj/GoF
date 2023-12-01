package gof.abstractfactory.products;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("WindowsButton criado");
    }
}
