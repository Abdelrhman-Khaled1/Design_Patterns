package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingletonObject();
        System.out.println(singleton.s);
    }
}
