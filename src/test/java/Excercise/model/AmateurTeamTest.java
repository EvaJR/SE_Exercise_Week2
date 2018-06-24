package Excercise.model;

import org.junit.Test;

public class AmateurTeamTest {

    @Test

    public void constructorAndGetterAmateurTeam() {
        String testName = "thisIsATest";
        AmateurTeam tester = new AmateurTeam(testName, "test");
        assert(tester.getName().equals(testName));
    }
    @Test

    public void getterMascotte() {
        String testMascotte = "thisIsATest";
        AmateurTeam tester = new AmateurTeam("test", testMascotte);
        assert(tester.getMascotte().equals(testMascotte));
    }

    // how to test toString method??
}
