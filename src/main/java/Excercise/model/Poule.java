package Excercise.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poule {

    public void poule(List teams) {

        Team feyenoord = new ProfTeam("Feyenoord", "Nike");
        Team ado = new ProfTeam("ADO Den Haag","Capgemini");
        Team leidscheBoys = new AmateurTeam("VV Leidsche Boys", "Sleutel");
        Team sparta = new ProfTeam("Sparta", "Unilever");
        Team excelsior = new ProfTeam("Excelsior", "Bolletje");
        Team haaglandia = new AmateurTeam("Haaglandia", "Haags Hopje");
        Team katwijk = new AmateurTeam("VV Katwijk", "Katje");
        Team monster = new AmateurTeam("SC Monster", "Het Monster");

        teams.add(feyenoord);
        teams.add(ado);
        teams.add(leidscheBoys);
        teams.add(sparta);
        teams.add(excelsior);
        teams.add(haaglandia);
        teams.add(katwijk);
        teams.add(monster);

        Collections.shuffle(teams);

    }




}
