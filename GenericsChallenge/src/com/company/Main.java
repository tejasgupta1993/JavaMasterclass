package com.company;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

//        footballLeague.add(baseballTeam);

        footballLeague.showLeagueTable();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        Soccer beckham = new Soccer("Beckham");

        Team rawteam = new Team("Raw Team");
        rawteam.addPlayer(beckham);     // unchecked warning
        rawteam.addPlayer(pat);         // unchecked warning

        footballLeague.add(rawteam);        // unchecked warning

        League<Team> rawLeague = new League<>("RAW");
        rawLeague.add(adelaideCrows);       // no warning
        rawLeague.add(baseballTeam);        // no warning
        rawLeague.add(rawteam);         // no warning

        League<Team> reallyRaw = new League<>("RAW");
        reallyRaw.add(adelaideCrows);       // unchecked warning
        reallyRaw.add(baseballTeam);        // unchecked warning
        reallyRaw.add(rawteam);         // unchecked warning





    }
}
