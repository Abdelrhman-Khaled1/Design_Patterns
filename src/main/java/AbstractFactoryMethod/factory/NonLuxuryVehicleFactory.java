package AbstractFactoryMethod.factory;

import AbstractFactoryMethod.SUV.NonLuxurySUV;
import AbstractFactoryMethod.SUV.SUV;
import AbstractFactoryMethod.car.Car;
import AbstractFactoryMethod.car.NonLuxuryCar;

public class NonLuxuryVehicleFactory extends VehicleFactory {

    @Override
    public Car getCar() {
        return new NonLuxuryCar("NL-C");
    }

    @Override
    public SUV getSUV() {
        return new NonLuxurySUV("NL-S");
    }
}
