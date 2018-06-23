package Excercise.model;

public class AmateurTeam extends Team {
    String mascotte;
    String honkkroeg;

    public AmateurTeam(String name, String mascotte) {
        this.name = name;
        this.mascotte = mascotte;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }

    public String getHonkkroeg() {
        return honkkroeg;
    }

    public void setHonkkroeg(String honkkroeg) {
        this.honkkroeg = honkkroeg;
    }

    @Override
    public String toString() {
        return "AmateurTeam{" +
                "mascotte='" + mascotte + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
