package Excercise;

import Excercise.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This app shows the results of a football tournament in the console.
 * Four amateur teams and four prof teams participate.
 * It ends with a party!
 */
public class TournamentApp {
    public static void main(String[] args) {

        Poule poule = new Poule ();

        List<Team> teams = new ArrayList<>();

        poule.poule(teams);

        Tournament round1 = new Tournament();

        List<Team> winnersRound1 = new ArrayList<>();

        for(int i = 0; i < teams.size(); i+=2) {

            winnersRound1 = round1.match(teams.get(i), teams.get(i + 1));
        }
        System.out.println("The following teams are going to the second round:");
        for (Team i : winnersRound1) {
            System.out.println(i.getName());
        }
        System.out.println("---------------------------");

        Tournament round2 = new Tournament();

        List<Team> winnersRound2 = new ArrayList<>();

        for(int i = 0; i < 4; i+=2) {
            winnersRound2 = (round2.match(winnersRound1.get(i), winnersRound1.get(i + 1)));
        }
        System.out.println("The following teams are going to the final:");
        for (Team i : winnersRound2) {
            System.out.println(i.getName());
        }
        System.out.println("---------------------------------------------");

        Tournament round3 = new Tournament();

        List<Team> winnersRound3 = new ArrayList<>();

        for(int i = 0; i < 2; i+=2) {
            winnersRound3 = (round3.match(winnersRound2.get(i), winnersRound2.get(i + 1)));
        }

        String winner = "";
        String mascotteOrSponsor = "";

        for (Team i : winnersRound3) {
            winner = i.getName();

            if (i instanceof AmateurTeam) {
                 mascotteOrSponsor = "it's mascot: " + ((AmateurTeam) i).getMascotte();
            } else if (i instanceof ProfTeam) {
                mascotteOrSponsor = "it's sponsor: "+ ((ProfTeam) i).getSponsor();
            }
        }
        System.out.println(winner + " has won the tournament!");

        System.out.println("---------------------------------------------");

        System.out.println(winner + " is celebrating with " + mascotteOrSponsor);

    }
}
