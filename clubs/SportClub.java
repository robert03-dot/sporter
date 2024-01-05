package src.clubs;

import src.clubs.SportTeam;
import src.sporters.Basketballer;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SportClub implements Serializable {

    ArrayList<SportTeam> sportTeams;
    private String name;
    private int foundingYear;
    private static final long serialVersionUID = 1L;

    public static void writeToBinaryFile(List<SportClub> data) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("clubs.dat")))) {
            objectOutputStream.writeObject(data);
        }
    }

    public static List<SportClub> readFromBinaryFile() throws IOException {
        List<SportClub> data = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("clubs.dat")))) {
            data = (List<SportClub>) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("A class not found exception: " + e.getMessage());
        }
        return data;
    }

    public SportClub(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        sportTeams = new ArrayList<>();
    }

    public void addInClub(SportTeam<Basketballer> sportTeam) {
        if (!sportTeams.contains(sportTeam)) {
            sportTeams.add(sportTeam);
        }
    }

    @Override
    public String toString() {
        return "Teams in the club: " + sportTeams + "\n" + "Club name: " + name + "\n" + "Founding year: " + foundingYear;
    }
}
