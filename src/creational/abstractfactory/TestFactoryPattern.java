package creational.abstractfactory;

import creational.abstractfactory.CarFactory;
import creational.abstractfactory.CarType;

/*
	Abstract factory pattern is used whenever we need another level of abstraction over a group of factories created using factory pattern.
 */
public class TestFactoryPattern {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
