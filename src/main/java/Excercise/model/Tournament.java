package Excercise.model;

import java.util.ArrayList;
import java.util.List;

public class Tournament {

    public int generateScore () {
        return (int) Math.floor(Math.random() * 6);

    }
    List<Team> winners = new ArrayList<>();
    public List match(Team team1, Team team2) {


        team1.setScore(generateScore());
        team2.setScore(generateScore());

        System.out.println(team1.name + " - " + team2.name + ": " + team1.getScore() + " - " + team2.getScore() );

        if (team1.getScore() > team2.getScore()) {
            System.out.println(team1.name + " has won!");
            winners.add(team1);
        } else if (team2.getScore() > team1.getScore()) {
            System.out.println(team2.name + " has won!");
            winners.add(team2);
        } else {
            System.out.print("It is a draw. Penalties: ");
            int penalties = (int) Math.floor(Math.random() * 2);

            if (penalties == 1) {
                System.out.println(team1.name + " has won!");
                winners.add(team1);
            } else {
                System.out.println(team2.name + " has won!");
                winners.add(team2);
            }
        }
        System.out.println("---------------------------------------------");




        return winners;



    }


}
