package AbstractFactoryMethod.car;

public class NonLuxuryCar implements Car{
    private String name;

    public NonLuxuryCar(String name) {
        this.name = name;
    }

    @Override
    public String getCarName() {
        return name;
    }

    @Override
    public String getCarFeatures() {
        return "NonLuxuryCar Features";
    }
}
