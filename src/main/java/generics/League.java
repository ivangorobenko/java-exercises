package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    ArrayList<T> teams = new ArrayList<>();
    public void addTeam(T team) {
        this.teams.add(team);
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public ArrayList<T> getStandings() {
        ArrayList<T> teamsToSort = (ArrayList<T>) teams.clone();
        Collections.sort(teamsToSort);
        return teamsToSort;
    }
}
