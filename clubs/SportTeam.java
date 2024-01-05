package src.clubs;

import src.humans.Human;

import java.io.Serializable;
import java.util.ArrayList;

public class SportTeam<E extends Human> implements Serializable {

    private String name;
    private String description;
    private ArrayList<E> sporters = new ArrayList<>();

    public SportTeam(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean addSporter(E sporter) {
        if (sporters.contains(sporter)) {
            System.out.println("Error: Sporter " + sporter.getName() + " is already in aquarium.");
            return false;
        }
        sporters.add(sporter);
        System.out.println("Sporter: " + sporter.getName() + " added into the team.");
        return true;
    }

    @Override
    public String toString() {
        return
                "Team name: " + name + "\n" +
                "Description of the team: " + description + "\n" +
                "Sporters : " + sporters;
    }
}
