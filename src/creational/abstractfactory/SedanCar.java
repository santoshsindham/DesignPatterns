package creational.abstractfactory;

public class SedanCar extends Car {

    SedanCar(Location location){

        super(CarType.SEDAN, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building Sedan Car...");
    }
}
