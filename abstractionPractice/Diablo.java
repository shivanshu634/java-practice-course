package myjavapackage.intermediate.abstractionPractice;

//SUBCLASS
public class Diablo extends Game implements MultiplayerMode {

    public Diablo(String gameName,String gameDeveloper, short yearOfRelease, byte numberOfChapter, long copiesSold, float ratings, float latestGamePrice) {
        super(gameName,gameDeveloper, yearOfRelease, numberOfChapter, copiesSold, ratings, latestGamePrice);
    }
//call interface method in gamestarted method
    @Override
    public void gameStarted() {
        System.out.println("let's play the Diablo..");
        multiplayerMode();
    }

    @Override
    public String getGameType() {
        return "Action RPG ";
    }

  //Interface method
    public void multiplayerMode(){
        System.out.println("Multiplayer game mode Started..");
    }
}
