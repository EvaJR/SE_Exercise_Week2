package Excercise.model;

import java.util.ArrayList;
import java.util.List;

public class Tournament {

    List teams = new ArrayList<>();

    // ADO Den Haag, Feyenoord, Sparta, Excelsior (prof)
    // VV Leidsche Boys, Haaglandia, VV Katwijk, SC Monster

    public int generateScore () {
        return (int) Math.floor(Math.random() * 6);

    }

    public void match(Team team1, Team team2) {
        team1.setScore(generateScore());
        team2.setScore(generateScore());

        if (team1.getScore() > team2.getScore()) {
            System.out.println(team1.name + " has won!");
        } else if (team2.getScore() > team1.getScore()) {
            System.out.println(team2.name + " has won!");
        } else {
            System.out.println("It is a draw");
        }

    }


}
