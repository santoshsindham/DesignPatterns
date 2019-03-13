package structural.flyweight;

/*
Flyweight design pattern enables use sharing of objects to support large numbers of fine-grained objects efficiently.
A flyweight is a shared object that can be used in multiple contexts simultaneously.
The flyweight acts as an independent object in each context.
 */
public class PaintBrushClient
{
    public static void main(String[] args)
    {
        Pen yellowThinPen1 = PenFactory.getThickPen("YELLOW");  //created new pen
        yellowThinPen1.draw("Hello World !!");

        Pen yellowThinPen2 = PenFactory.getThickPen("YELLOW");  //pen is shared
        yellowThinPen2.draw("Hello World !!");

        Pen blueThinPen = PenFactory.getThickPen("BLUE");       //created new pen
        blueThinPen.draw("Hello World !!");

        System.out.println(yellowThinPen1.hashCode());
        System.out.println(yellowThinPen2.hashCode());

        System.out.println(blueThinPen.hashCode());
    }
}