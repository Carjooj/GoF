package gof.abstractfactory.products;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("WindowsCheckbox criada");
    }
}
