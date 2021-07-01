package myjavapackage.intermediate.encapsulationPractice;
//PARENT CLASS

public class Game {
//Class fields or variables
   private String gameName = "Diablo";
   private String gameType = "Action RPG";
   private String gameDeveloper = "Blizzard North";
   private short yearOfRelease = 1996;
   private String platformRequired = "Android and IOS";
   private byte numberOfChapter = 3;
   private long copiesSold = 24000000;
   private float ratings = 4.5F;
   private String musicComposer = "Matt Uelmen";
   private float latestGamePrice = 54.99F;

//Class Constructor
    public Game(String gameName, String gameType, String gameDeveloper, short yearOfRelease, byte numberOfChapter,
                long copiesSold, float ratings, float latestGamePrice){
        this.gameName = gameName;
        this.gameType = gameType;
        this.gameDeveloper = gameDeveloper;
        this.yearOfRelease = yearOfRelease;
        this.numberOfChapter = numberOfChapter;
        this.copiesSold = copiesSold;
        this.ratings = ratings;
        this.latestGamePrice = latestGamePrice;

    }

    public void gameStarted(){
        System.out.println("let's play the game");
    }
//gettter
    public String getGameName() {
        return gameName;
    }
//getter and setter
    public byte getNumberOfChapter() {
        return numberOfChapter;
    }

    public void setNumberOfChapter(byte numberOfChapter) {
        this.numberOfChapter = numberOfChapter;
    }
//setter
    public void setLatestGamePrice(float latestGamePrice) {
        this.latestGamePrice = latestGamePrice;
    }

    //Class method

    public void getDescription(){

        System.out.println("Game Name: "+ gameName);
        System.out.println("Game Developed By: : "+ gameDeveloper);
        System.out.println("Game Type: : "+ gameType);
        System.out.println("Game music composed by: "+ musicComposer);
        System.out.println("Game released on: "+ yearOfRelease);
        System.out.println("Ratings: "+ ratings);
        System.out.println("Available to Play on: "+ platformRequired);
        System.out.println("You can Buy it at: "+ latestGamePrice+ " euro");
        System.out.println("Number of chapter you can play: "+ numberOfChapter);
        System.out.println("Number of game copies sold till date: "+ copiesSold);
    }
}
