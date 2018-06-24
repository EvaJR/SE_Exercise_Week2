package Excercise.model;

import org.junit.Test;

public class TeamTest {

    @Test

    public void setterAndGettersTeam() {
        ProfTeam tester = new ProfTeam("test", "test"); // team itself is abstract and cannot be instantiated
        tester.setScore(-1);
        assert(tester.getScore() == -1);
        assert(tester.getName() == "test");
    }



}
