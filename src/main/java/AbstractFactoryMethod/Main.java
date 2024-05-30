package AbstractFactoryMethod;

import AbstractFactoryMethod.SUV.SUV;
import AbstractFactoryMethod.car.Car;
import AbstractFactoryMethod.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory(args[0]);
        if (args[1].equals("Car")) {

            Car car = vehicleFactory.getCar();
            System.out.println(car.getCarName());
            System.out.println(car.getCarFeatures());

        } else if (args[1].equals("SUV")) {

            SUV suv = vehicleFactory.getSUV();
            System.out.println(suv.getSUVName());
            System.out.println(suv.getSUVFeatures());

        }
    }
}
