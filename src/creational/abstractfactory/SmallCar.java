package creational.abstractfactory;

public class SmallCar extends Car {

    SmallCar(Location location){

        super(CarType.SMALL, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building Small Car...");
    }
}
