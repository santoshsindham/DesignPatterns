package structural.decorator;

/*
Decorator design pattern is used to add additional features or behaviors to a particular instance of a class,
while not modifying the other instances of same class.

 */
public class DecoratorPatternTest {
    public static void main(String[] args) {

        SupportPopupDecorator supportPopupDecoratored = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
        System.out.println(supportPopupDecoratored.getFirstColumnData());
    }
}