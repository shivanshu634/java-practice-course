package myjavapackage.intermediate.polymorphismPractice;

//ANOTHER SUBCLASS
public class Warcraft extends Game {

    public Warcraft(String gameName,String gameDeveloper, short yearOfRelease, byte numberOfChapter, long copiesSold, float ratings, float latestGamePrice) {
        super(gameName,gameDeveloper, yearOfRelease, numberOfChapter, copiesSold, ratings, latestGamePrice);
    }

    @Override
    public void gameStarted() {
        System.out.println("let's play the Warcraft..");
    }

    public String getGameType(){
        return "Real Time Strategic Game";
    }
}
