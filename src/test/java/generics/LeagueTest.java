package generics;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LeagueTest {
    @Test
    public void should_to_add_a_team() {
        //GIVEN
        League<FootballTeam> league = new League<>();

        //WHEN
        FootballTeam team = new FootballTeam("A");
        league.addTeam(team);

        //THEN
        assertEquals(league.getTeams().get(0), team);
    }

    @Test
    public void should_give_teams_standings(){
        //GIVEN
        League<FootballTeam> league = new League<>();
        FootballTeam teamA = new FootballTeam("A");
        teamA.setScore(20);
        FootballTeam teamB = new FootballTeam("B");
        teamB.setScore(36);
        FootballTeam teamC = new FootballTeam("C");
        teamC.setScore(12);
        league.addTeam(teamA);
        league.addTeam(teamB);
        league.addTeam(teamC);

        //WHEN
        ArrayList<FootballTeam> standings = league.getStandings();

        //THEN
        assertEquals(standings.get(0).getName(), teamB.getName());
        assertEquals(standings.get(1).getName(), teamA.getName());
        assertEquals(standings.get(2).getName(), teamC.getName());
    }
}