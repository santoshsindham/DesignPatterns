package creational.factory;

public class LuxuryCar extends Car {

    LuxuryCar(){

        super(CarType.LUXURY);
        construct();
    }
    @Override
    protected void construct() {

        System.out.println("Building Luxury Car");
    }
}
