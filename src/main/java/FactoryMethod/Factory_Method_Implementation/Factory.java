package FactoryMethod.Factory_Method_Implementation;

import FactoryMethod.hierarchy_class.Female;
import FactoryMethod.hierarchy_class.Male;
import FactoryMethod.hierarchy_class.Person;

public class Factory {
    public Person getPerson(String name, String gender) {
        Person p = null;
        if (gender.equals("M"))
            p = new Male(name);
        else if (gender.equals("F"))
            p = new Female(name);
        return p;
    }

}
