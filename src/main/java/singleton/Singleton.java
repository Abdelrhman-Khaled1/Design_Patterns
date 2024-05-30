package singleton;

public class Singleton {
    private static Singleton singletonObject = null;

    public String s;
    private Singleton() {
        s = "Hello I am a string part of Singleton class";
    }

    public static Singleton getSingletonObject() {
        if (singletonObject == null) {
            singletonObject = new Singleton();
        }
        return singletonObject;
    }
}
