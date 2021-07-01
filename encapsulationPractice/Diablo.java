package myjavapackage.intermediate.encapsulationPractice;

//SUBCLASS
public class Diablo extends Game {

    public Diablo(String gameName, String gameType, String gameDeveloper, short yearOfRelease, byte numberOfChapter, long copiesSold, float ratings, float latestGamePrice) {
        super(gameName, gameType, gameDeveloper, yearOfRelease, numberOfChapter, copiesSold, ratings, latestGamePrice);
    }

    @Override
    public void gameStarted() {
        System.out.println("let's play the Diablo..");
    }
}
