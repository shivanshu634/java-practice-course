package myjavapackage.intermediate.polymorphismPractice;

public class GameApp {

    //Main Class Method

    public static void main(String[] args) {
        Diablo diablo = new Diablo("Diablo","Blizzard North",(short)1977,
                (byte)3,24000000,(float)4.5,(float)59.8);
        System.out.println("The game name: "+diablo.getGameName());
        diablo.setLatestGamePrice((float)49.8);
        diablo.setNumberOfChapter(4.5);
        System.out.println("The number of Chapters: "+diablo.getNumberOfChapter());
        System.out.println("The game Type: "+ diablo.getGameType());
        diablo.gameStarted();


        System.out.println("----------------------------------------");

        Warcraft warcraft = new Warcraft("Warcraft","Blizzard Entertainment",(short)1994,(byte)4,25000000,(float)4.6,(float)11.2);
        System.out.println("The game name: "+ warcraft.getGameName());
        warcraft.setLatestGamePrice((float)49.8);
        warcraft.setNumberOfChapter((byte)5);
        System.out.println("The number of Chapters: "+warcraft.getNumberOfChapter());
        System.out.println("The game Type: "+ warcraft.getGameType());
        warcraft.gameStarted();

    }

}
