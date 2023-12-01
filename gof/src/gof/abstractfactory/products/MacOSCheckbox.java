package gof.abstractfactory.products;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOSCheckbox criada");
    }
}
