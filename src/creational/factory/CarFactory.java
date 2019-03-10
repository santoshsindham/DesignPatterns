package creational.factory;

public class CarFactory {

    public static Car buildCar(CarType carType){

        Car car = null;
        switch (carType){
            case SMALL:
                car = new SmallCar();
                break;

            case SEDAN:
                car = new SedanCar();
                break;

            case LUXURY:
                car = new LuxuryCar();
                break;

            default:
                break;
        }
        return car;
    }
}
