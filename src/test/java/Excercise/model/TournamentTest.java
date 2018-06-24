package Excercise.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TournamentTest {

    @Test
    public void testGenerateScore() {
        Tournament tester = new Tournament();
        int test = tester.generateScore();
        System.out.println(test);
        assert(test >= 0 && test <= 5);
    }

    // how to test match method?

    @Test
    public void testMatch() {
        Tournament tester = new Tournament();
        List<Team> tests = new ArrayList<>();
        List<Team> winners = new ArrayList<>();

        Poule testPoule = new Poule();

        testPoule.poule(tests);

        winners = tester.match(tests.get(0), tests.get(1));
    }
}
