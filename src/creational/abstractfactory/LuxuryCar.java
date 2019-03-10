package creational.abstractfactory;

public class LuxuryCar extends Car {

    LuxuryCar(Location location){

        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building Luxury Car...");
    }
}
