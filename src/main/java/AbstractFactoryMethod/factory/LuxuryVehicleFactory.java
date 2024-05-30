package AbstractFactoryMethod.factory;

import AbstractFactoryMethod.SUV.LuxurySUV;
import AbstractFactoryMethod.SUV.SUV;
import AbstractFactoryMethod.car.Car;
import AbstractFactoryMethod.car.LuxuryCar;

public class LuxuryVehicleFactory extends VehicleFactory{


    @Override
    public Car getCar() {
        return new LuxuryCar("L-C");
    }

    @Override
    public SUV getSUV() {
        return new LuxurySUV("L-S");
    }
}
