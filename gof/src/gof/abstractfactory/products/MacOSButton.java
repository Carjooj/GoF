package gof.abstractfactory.products;

public class MacOSButton implements Button {

    @Override
    public void paint() {
      System.out.println("MacOSButton criado");
    }
    
}
