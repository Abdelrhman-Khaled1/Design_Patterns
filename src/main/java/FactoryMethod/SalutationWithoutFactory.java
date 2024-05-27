package FactoryMethod;

import FactoryMethod.hierarchy_class.Female;
import FactoryMethod.hierarchy_class.Male;
import FactoryMethod.hierarchy_class.Person;


public class SalutationWithoutFactory {
    public static void main(String[] args) {

        Person p;
        if (args[1].equals("M"))
            p = new Male(args[0]);
        else if (args[1].equals("F")) {
            p = new Female(args[0]);


        }
    }
}
