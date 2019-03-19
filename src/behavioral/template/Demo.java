package behavioral.template;

/*
Template method pattern defines the sequential steps to execute a
multi-step algorithm and optionally can provide a default implementation as well (based on requirements).
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println("Going to build concrete wall house");
        House house = new ConcreteWallHouse();
        house.buildhouse();

        System.out.println("Concrete Wall House constructed successfully");

        System.out.println("*************************");

        System.out.println("Going to build Glass Wall House");

        house = new GlassWallHouse();
        house.buildhouse();

        System.out.println("Glass Wall House constructed successfully");
    }
}