package myjavapackage.intermediate.encapsulationPractice;

import myjavapackage.intermediate.inheritancePactice.Game;

//ANOTHER SUBCLASS
public class Warcraft extends Game {

    public Warcraft(String gameName, String gameType, String gameDeveloper, short yearOfRelease, byte numberOfChapter, long copiesSold, float ratings, float latestGamePrice) {
        super(gameName, gameType, gameDeveloper, yearOfRelease, numberOfChapter, copiesSold, ratings, latestGamePrice);
    }

    @Override
    public void gameStarted() {
        System.out.println("let's play the Warcraft..");
    }
}
