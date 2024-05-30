package AbstractFactoryMethod.SUV;

public class NonLuxurySUV implements SUV{

    private String name;

    public NonLuxurySUV(String name){
        this.name = name;
    }

    @Override
    public String getSUVName() {
        return name;
    }

    @Override
    public String getSUVFeatures() {
        return "Luxury SUV Features";
    }
}
