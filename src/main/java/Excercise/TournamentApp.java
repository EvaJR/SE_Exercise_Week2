package Excercise;

import Excercise.model.AmateurTeam;
import Excercise.model.ProfTeam;
import Excercise.model.Team;
import Excercise.model.Tournament;

/**
 * Hello world!
 */
public class TournamentApp {
    public static void main(String[] args) {

        Team ado = new ProfTeam("ADO Den Haag","die Chinees");
        Team leidscheBoys = new AmateurTeam("VV Leidsche Boys", "Sleutel");
        System.out.println(ado);
        System.out.println(leidscheBoys);

        Tournament test = new Tournament();

        test.match(ado, leidscheBoys);


    }
}
