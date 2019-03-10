package creational.prototype;

/*
Prototype design pattern is used in scenarios where application needs
to create a large number of instances of a class, which have almost
same state or differ very little.
 */
public class TestPrototypePattern {

    public static void main(String[] args){

        try {
            String movieType = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
            System.out.println(movieType);

            String albumType = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM).toString();
            System.out.println(albumType);

            String showType = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW).toString();
            System.out.println(showType);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
