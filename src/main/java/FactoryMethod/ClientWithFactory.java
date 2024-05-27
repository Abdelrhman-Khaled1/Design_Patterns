package FactoryMethod;

import FactoryMethod.Factory_Method_Implementation.Factory;

public class ClientWithFactory {
    public static void main(String[] args) {

        Factory factory = new Factory();
        factory.getPerson(args[0], args[1]);

    }
}
