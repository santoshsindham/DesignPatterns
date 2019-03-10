package creational.factory;

public class SedanCar extends Car {

    SedanCar(){

        super(CarType.SEDAN);
        construct();
    }
    @Override
    protected void construct() {

        System.out.println("Building Sedan Car");
    }
}