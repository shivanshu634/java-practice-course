package myjavapackage.intermediate.abstractionPractice;
//PARENT CLASS

public abstract class Game {
//Class fields or variables
   private String gameName ;
   private String gameDeveloper ;
   private short yearOfRelease ;
   private String platformRequired ;
   private byte numberOfChapter ;
   private long copiesSold ;
   private float ratings ;
   private String musicComposer ;
   private float latestGamePrice ;

//Class Constructor
    public Game(String gameName,String gameDeveloper, short yearOfRelease, byte numberOfChapter,
                long copiesSold, float ratings, float latestGamePrice){
        this.gameName = gameName;
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

    //Getter
    public String getGameName() {
        return gameName;
    }

    //Gettter and Setter

    public byte getNumberOfChapter() {
        return numberOfChapter;
    }

    public void setNumberOfChapter(byte numberOfChapter) {
        this.numberOfChapter = numberOfChapter;
    }

    //Setter

    public void setLatestGamePrice(float latestGamePrice) {
        this.latestGamePrice = latestGamePrice;
    }

//Abstract Method
    public abstract String getGameType();



    public void getDescription(){

        System.out.println("Game Name: "+ gameName);
        System.out.println("Game Developed By: : "+ gameDeveloper);
        System.out.println("Game music composed by: "+ musicComposer);
        System.out.println("Game released on: "+ yearOfRelease);
        System.out.println("Ratings: "+ ratings);
        System.out.println("Available to Play on: "+ platformRequired);
        System.out.println("You can Buy it at: "+ latestGamePrice+ " euro");
        System.out.println("Number of chapter you can play: "+ numberOfChapter);
        System.out.println("Number of game copies sold till date: "+ copiesSold);
    }
}
