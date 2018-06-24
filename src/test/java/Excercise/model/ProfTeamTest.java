package Excercise.model;

import org.junit.Test;

public class ProfTeamTest {

    @Test
    public void testProfTeamConstructorAndGetter() {
        String testName = "thisIsATest";
        String testSponsor = "thisIsAlsoATest";
        ProfTeam tester = new ProfTeam(testName, testSponsor);
        assert(tester.getName().equals(testName));
        assert(tester.getSponsor().equals(testSponsor));

    }
}
