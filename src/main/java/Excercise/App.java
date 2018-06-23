package Excercise;

import Excercise.model.ProfTeam;
import Excercise.model.Team;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Team psv = new ProfTeam();
        psv.setName("psv");
        System.out.println("The team name is " + psv.getName());

    }
}
