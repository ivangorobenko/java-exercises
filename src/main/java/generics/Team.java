package generics;

public class Team implements Comparable<Team> {
    private final String name;
    private Integer score;

    public Team(String name) {
        this.name = name;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public int compareTo(Team team) {
        return team.score.compareTo(this.score);
    }

    public String getName() {
        return name;
    }
}
