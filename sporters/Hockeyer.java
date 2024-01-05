package src.sporters;

import src.behaviors.IHitPuck;
import src.behaviors.ITackle;
import src.humans.Human;

public class Hockeyer extends Human implements IHitPuck, ITackle {
    public Hockeyer(String name, int birthDate) {
        super(name, birthDate);
    }

    @Override
    public void hitPuck() {
        System.out.println("This hockeyer hits the puck very well");
    }

    @Override
    public void tackle() {
        System.out.println("This hockeyer can perform a very good tackle");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Birthdate: " + getBirthDate();
    }
}
