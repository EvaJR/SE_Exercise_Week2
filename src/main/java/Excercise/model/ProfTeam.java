package Excercise.model;

public class ProfTeam extends Team {
    double budget;
    String sponsor;

    public ProfTeam(String name, String sponsor) {
        this.name = name;
        this.sponsor = sponsor;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public String toString() {
        return "ProfTeam{" +
                "sponsor='" + sponsor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
