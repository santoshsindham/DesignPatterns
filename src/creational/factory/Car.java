package creational.factory;

public abstract class Car {

    private CarType model = null;

    public Car(CarType carType){

        this.model = carType;
        arrangeParts();
    }

    private void arrangeParts(){

    }

    protected abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
