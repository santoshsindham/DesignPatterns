package creational.abstractfactory;

public class AsiaCarFactory {

    public static Car buildCar(CarType carType){

        Car car = null;
        switch (carType){
            case SMALL:
                car = new SmallCar(Location.ASIA);
                break;
            case SEDAN:
                car = new SedanCar(Location.ASIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.ASIA);
                break;
            default:
                break;
        }
        return car;
    }
}
