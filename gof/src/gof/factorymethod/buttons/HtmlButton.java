package gof.factorymethod.buttons;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("click! Button says - 'Hello World!'");
    }
    
}
