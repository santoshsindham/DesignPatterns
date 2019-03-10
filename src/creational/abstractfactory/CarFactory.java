package creational.abstractfactory;

public class CarFactory {

    private CarFactory(){

    }

    public static Car buildCar(CarType carType){

        Car car = null;
        Location location = Location.ASIA; //read from a config file

        switch (location){
            case USA:
                car = USACarFactory.buildCar(carType);
                break;
            case ASIA:
                car = AsiaCarFactory.buildCar(carType);
                break;
            case DEFAULT:
                car = DefaultCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}
