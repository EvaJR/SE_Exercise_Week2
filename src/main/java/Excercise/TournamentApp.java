package Excercise;

import Excercise.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This app shows the results of a football tournament in the console.
 * Four amateur teams and four prof teams participate.
 * It ends with a party!
 */
public class TournamentApp {
    public static void main(String[] args) {

        Team feyenoord = new ProfTeam("Feyenoord", "Nike");
        Team ado = new ProfTeam("ADO Den Haag","Capgemini");
        Team leidscheBoys = new AmateurTeam("VV Leidsche Boys", "Sleutel");
        Team sparta = new ProfTeam("Sparta", "Unilever");
        Team excelsior = new ProfTeam("Excelsior", "Bolletje");
        Team haaglandia = new AmateurTeam("Haaglandia", "Haags Hopje");
        Team katwijk = new AmateurTeam("VV Katwijk", "Katje");
        Team monster = new AmateurTeam("SC Monster", "Het Monster");

        List<Team> teams = new ArrayList<>();

        teams.add(feyenoord);
        teams.add(ado);
        teams.add(leidscheBoys);
        teams.add(sparta);
        teams.add(excelsior);
        teams.add(haaglandia);
        teams.add(katwijk);
        teams.add(monster);

        Collections.shuffle(teams);

        Tournament round1 = new Tournament();

        List resultRound1 = new ArrayList();

        for(int i = 0; i < 8; i+=2) {
            // resultRound1.add(round1.match(teams.get(i), teams.get(i + 1))); // list in list? strange
            round1.match(teams.get(i), teams.get(i + 1));
        }



        Tournament round2 = new Tournament();

        List resultRound2 = new ArrayList();

        for(int i = 0; i < 4; i+=2) {
            resultRound2.add(round2.match(teams.get(i), teams.get(i + 1)));
        }
        System.out.println(resultRound2);

        Tournament round3 = new Tournament();

        List resultRound3 = new ArrayList();

        for(int i = 0; i < 2; i+=2) {
            resultRound3.add(round3.match(teams.get(i), teams.get(i + 1)));
        }
        System.out.println(resultRound3);



    }
}
