package creational.abstractfactory;

public abstract class Car {

    private CarType carType = null;
    private Location location = null;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    public abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}
