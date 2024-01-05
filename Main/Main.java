package src.Main;

import src.clubs.SportClub;
import src.sporters.Basketballer;
import src.sporters.Footballer;
import src.sporters.Hockeyer;
import src.clubs.SportTeam;

public class Main {
    public static void main(String[] args) {
        Footballer footballer1 = new Footballer("Messi",1987);
        Footballer footballer2 = new Footballer("Ronaldo",1985);
        Basketballer basketballer1 = new Basketballer("John",2000);
        Basketballer basketballer2 = new Basketballer("Tom",1990);
        Hockeyer hockeyer1 = new Hockeyer("Tim",2001);
        Hockeyer hockeyer2 = new Hockeyer("Jake",1986);
        SportTeam<Basketballer> basketTeam = new SportTeam<>("CSA", "BasketTEAM");
        basketTeam.addSporter(basketballer1);
        basketTeam.addSporter(basketballer2);
        SportTeam<Footballer> footballTeam = new SportTeam<>("FC_Barcelona","FootballTEAM");
        footballTeam.addSporter(footballer1);
        footballTeam.addSporter(footballer2);
        SportTeam<Hockeyer> hockeyTeam = new SportTeam<>("Dinamo_Rapid","hockeyTEAM");
        hockeyTeam.addSporter(hockeyer1);
        hockeyTeam.addSporter(hockeyer2);
        SportClub basketballClub = new SportClub("Basketball-one",2010);
        basketballClub.addInClub(basketTeam);
        System.out.println(basketballClub);
        System.out.println("=============");
    }
}
