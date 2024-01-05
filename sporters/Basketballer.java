package src.sporters;

import src.behaviors.IBodySlam;
import src.behaviors.IDunk;
import src.behaviors.ITackle;
import src.humans.Human;

public class Basketballer extends Human implements IDunk, ITackle, IBodySlam {
    public Basketballer(String name, int birthDate) {
        super(name, birthDate);
    }

    @Override
    public void dunk() {
        System.out.println("This basketballer can dunk");
    }

    @Override
    public void tackle() {
        System.out.println("This basketballer can tackle");
    }

    @Override
    public void bodySlam() {
        System.out.println("This basketballer can perform a body slam");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Birthdate: " + getBirthDate();
    }
}
