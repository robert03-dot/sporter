package src.sporters;

import src.behaviors.IKickBall;
import src.behaviors.ITackle;
import src.behaviors.IThrowBall;
import src.humans.Human;

public class Footballer extends Human implements ITackle, IKickBall, IThrowBall {

    public Footballer(String name, int birthDate) {
        super(name, birthDate);
    }

    @Override
    public void kickBall() {
        System.out.println("This footballer can kick the ball very good");

    }

    @Override
    public void tackle() {
        System.out.println("This footballer can tackle very good");
    }

    @Override
    public void throwBall() {
        System.out.println("This footballer can throw very well");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Birthdate: " + getBirthDate();
    }
}
