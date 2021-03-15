package factoryMethod.buttons;

public class HtmlButton implements Button {/*The Html Button class implements methods of Button and in this methods we
write simply html code that gives us possibility to show a small window that prints us Hello World*/

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
