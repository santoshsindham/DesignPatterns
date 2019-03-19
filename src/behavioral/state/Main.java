package behavioral.state;

/*
In state pattern allows an object to alter its behavior when its internal state changes.
The object will appear to change its class. There shall be a separate concrete class per possible state of an object.

 */
public class Main
{
    public static void main(String[] args)
    {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");

        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}